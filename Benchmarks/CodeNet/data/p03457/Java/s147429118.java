import java.util.*;

class Main{
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt(),now = 0;
      String ans;
      boolean flag;
      int[][] list = new int[N][3];
      for(int i = 0; i < N; i++){
        for(int j = 0; j < 3 ; j++){
            list[i][j] = sc.nextInt();
        }
      }
      for(int i = 0; i < N; i++){
        if(list[i][1] + list[i][2] % 2 == 0){
          flag = true;
        }else{
          flag = false;
        }
        if((list[i][0]- now) < (list[i][1] + list[i][2])){
          System.out.println("No");
          System.exit(0);
        }else{
          if((list[i][0] - now )% 2 == 0){
            if(!flag)
            System.out.println("No");
            System.exit(0);
          }else{
            now = list[i][0];
          }
        }
      }
      System.out.println("Yes");
    }
}
