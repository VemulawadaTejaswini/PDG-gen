import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
      
      int ans = 0;
      for(int a=0; a<=A; a++){
        for(int b=0; b<=B; b++){
          for(int c=0; C<=C; c++){
            if(500*A+100*B+50*C==X){
              ans++;
            }
          }
        }
      }
      System.out.println(ans);
    }
}