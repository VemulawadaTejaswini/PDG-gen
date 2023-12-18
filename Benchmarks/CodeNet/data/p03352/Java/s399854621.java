import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       double t = 1, ans = 1;
       sc.close();
       
       for(int i=1; i<x; i++) {
           for(int j=2; t<x && i>1; j++) {
              t = Math.pow(i, j); 
              if (t<=x) ans = t;
           }
           t = 0;
           if(ans == x) break;
       }

       System.out.println((int)ans);

    }
}