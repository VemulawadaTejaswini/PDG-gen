import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aStr = sc.next();
        String bStr = sc.next();
        String cStr = sc.next();
        char curChar = 'a';
        int i = 0, j = 0, k = 0;
        while(true) {
          if(curChar == 'a') {
            if(i == aStr.length()) {
              System.out.println("A");
              return;
            }
            curChar = aStr.charAt(i++);
          } else if(curChar == 'b'){
            if(j == bStr.length()) {
              System.out.println("B");
              return;
            }
            curChar = bStr.charAt(j++);
          } else {
            if(k == cStr.length()) {
              System.out.println("C");
              return;
            }
            curChar = cStr.charAt(k++);
          }
        }
    }
}