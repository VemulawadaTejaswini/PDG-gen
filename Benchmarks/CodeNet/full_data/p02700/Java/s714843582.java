import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();

        boolean isTakahashi = true;

        while(true){
          if(isTakahashi){
            c -= b;
            if(c <= 0){
              System.out.println("Yes");
              return;
            }
          }else{
            a -= d;
            if(a <= 0){
              System.out.println("No");
              return;
            }
          }
          isTakahashi = isTakahashi ? false : true;
        }
    }
}