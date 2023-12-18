import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    int numA = 0;
    int numB = 0;
    int numC = 0;
    char present = 'a';
    String ans = "";
    while((numA < a.length()) && (numB < b.length()) && (numC < c.length())) {
      if(present == 'a') {
        present = a.charAt(numA);
        numA++;
        if(numA == a.length()) ans = "A";
      }
      if(present == 'b') {
        present = b.charAt(numB);
        numB++;
        if(numB == b.length()) ans = "B";
      }
      if(present == 'c') {
        present = c.charAt(numC);
        numC++;
        if(numC == c.length()) ans = "C";
      }
    }
    System.out.println(ans);
  }
}