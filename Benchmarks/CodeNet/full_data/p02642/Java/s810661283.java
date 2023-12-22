import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] A = new int[N];
      for(int i = 0; i < N; i++){
        A[i] = sc.nextInt();
      }
      Arrays.sort(A);
      
      // 判定
      boolean[] boolmap = new boolean[1000001];
      Arrays.fill(boolmap, true);
      List<Integer> okList = new ArrayList<>();
      
      for(int i = 0; i < N; i++){
        int index = okList.indexOf(A[i]);
        if(index == -1){
          if(boolmap[A[i]]){
            okList.add(A[i]);
            checkDivisible(A[i], boolmap);
          }
        }else{
          okList.remove(index);
        }
      }
      
      // 出力
      System.out.println(okList.size());
    }

    // boolmap内の割り切れる数をfalseにする関数
    public static void checkDivisible(int num, boolean[] boolmap){
      int X = num;
      while(X <= 1000000){
        boolmap[X] = false;
        X += num;
      }
    }


}