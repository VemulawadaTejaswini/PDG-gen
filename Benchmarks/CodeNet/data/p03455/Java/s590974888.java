import java.util.*;

public class Main {
    public static void main(String args[]) {
       //値を取得
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int answer = a * b;
       
       //表示
       if(answer % 2 != 0 ) {
           System.out.println("Odd");
       } else {
           System.out.println("Even");
       }
    }
}