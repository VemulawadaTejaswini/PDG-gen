//abc097a.java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       sc.close();

       if (a - c <= d && a - c >= -d) {
            System.out.println("Yes");
            return;
       }else if((a-b <= d && a-b >= -d) && (b-c <= d && b-c >= -d)) {
           System.out.println("Yes");
           return;
       }else System.out.println("No");
    }
}