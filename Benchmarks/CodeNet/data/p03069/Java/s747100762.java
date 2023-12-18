import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      String S = sc.next();
      
      int sum2 = 0;
      for (int i = 0; i<N; i++) {
      	if (S.charAt(i) == '.') sum2+=1;
        else break;
      }
      int sum3 = 0;
      for (int i = 0; i<N; i++) {
      	if (S.charAt(N-i-1) == '#') sum3+=1;
        else break;
      }
      
      int sum = 0;
      for (int i = sum2; i<N-sum3; i++) {
      	if (S.charAt(i) == '.') sum+=1;
      }
      System.out.println(sum);
    }
}