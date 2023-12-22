import java.util.Scanner;
  public class Main {
    public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        int ans = 0;
        
        for(int i=0; i<=N; i++){
         if(N > 0){
           ans += T;
         } else if(N <= 0){
           break;
         }
          N = N - X;
        }

        System.out.println(ans);
    }
  }