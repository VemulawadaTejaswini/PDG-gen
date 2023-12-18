    import java.util.*;
    class Main{
          public static void main(String[] args){
            // Nを取得
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            // 配列を取得
            ArrayList<Integer> inputArray = new ArrayList<Integer>();
            for(int i = 0; i < n ; i++){
              int tmp = sc.nextInt();
              inputArray.add(tmp);
            }
            for(int j = 0; j < n ; j++){
              // 除外配列作成
              ArrayList<Integer> tmpArray = new ArrayList<Integer>();
              for(Integer k: inputArray){
                tmpArray.add(k);
              }
              tmpArray.remove(j);
              // 小さい順に並び替え
              Collections.sort(tmpArray);
              System.out.println(tmpArray.get(n/2 - 1));
            }
           }
          }