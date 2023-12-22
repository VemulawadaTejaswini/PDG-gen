import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
       if (a > b){
        int t = a; 
         a = b;
         b = t;
       }else if (a > c) {
         int t = a;
          a = c;
          c = t;
       }else if (b > c) {
          int x = b;
           b = c;
           c = x;
}
          System.out.println(a+" "+b+" "+c);
  }
 }