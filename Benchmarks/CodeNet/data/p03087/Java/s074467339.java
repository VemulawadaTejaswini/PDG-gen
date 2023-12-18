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
        int index = T.indexOf("AC");
        while (index >= 0){
            answer++;
            T = T.substring(T.indexOf("AC")+2,T.length());
            index = T.indexOf("AC");
        }
        System.out.println(answer);
        answer = 0;
    }
  }
  
}
