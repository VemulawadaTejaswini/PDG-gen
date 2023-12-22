import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //展望台の数
        int M = sc.nextInt(); //道
        int[] height = new int[N];
        int[][] roadMap = new int[N][N];
        for(int i = 0; i < N; i++)
          Arrays.fill(roadMap[i], -1); //-1埋め
        for(int i = 0; i < N; i++)
          height[i] = sc.nextInt();
        for(int i = 0; i < M; i++){
          int from = Integer.parseInt(sc.next())-1;
          int to = Integer.parseInt(sc.next())-1;
          roadMap[from][to] = to;
          roadMap[to][from] = from;
        }
        int count = 0;
        for(int i = 0; i < N; i++){
          if(check(roadMap[i]) == false){
            int hyoukou = height[i];
            boolean judge = true;
            for(int j = 0; j < N; j++){
              if(roadMap[i][j] != -1 && hyoukou <= height[j]){
                judge = false;
                break;
              }
            }
            if(judge == true){
              count++;
              //System.out.println(i+1);
            }
          }else{
            count++;
            //System.out.println(i+1);
          }
        }

        System.out.println(count);
    }

    //-1以外のものが入っていたらfalse
    public static boolean check(int[] hairetu){
      boolean kekka = true;
      for(int i = 0; i < hairetu.length; i++){
        if(hairetu[i] != -1){
          kekka = false;
          break;
        }
      }
      return kekka;
    }
}
