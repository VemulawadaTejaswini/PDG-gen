import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String ans = "";
    String s = String.valueOf(N);
    for(int i=0;i<s.length();i++) {
      if(s.charAt(i)=='1') ans = ans+'9';
      if(s.charAt(i) == '9') ans = ans+'1';
      
    }
    System.out.println(ans);
    }
  }
