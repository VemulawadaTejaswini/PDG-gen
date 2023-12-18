import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String answer = "";
    
    String[] ary = S.split("");

    for(String a: ary) {
        if(!answer.endsWith(a)){
            answer += a;    
        }
    }
    
    System.out.println(answer.length());
  }
}
