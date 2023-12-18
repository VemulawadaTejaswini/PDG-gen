import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String S = sc.next();
    int answer = 0;
    for (int i = 0; i < Q; i++) {
        int start = sc.nextInt();
        int end = sc.nextInt();
        String T = S.substring(start - 1, end);
        int num = (T.length() - T.replaceAll("AC","").length()) / 2;
        System.out.println(num);

    }
  }
  
}
