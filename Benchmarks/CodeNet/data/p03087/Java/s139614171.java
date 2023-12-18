import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String S = sc.next();
    int[] ls = new int[Q];
    int[] rs = new int[Q];
    for (int i = 0; i < Q; i++) {
      ls[i] = sc.nextInt();
      rs[i] = sc.nextInt();
    }
    
    int[] ruisekiwa = new int[N];
    int ruiseki = 0;
    for (int i = 0; i < N-1; i++) {
      if (S.charAt(i) == 'A' && S.charAt(i+1) == 'C')
        ruiseki++;
      ruisekiwa[i] = ruiseki;
    }
    ruisekiwa[N-1] = ruiseki;
    
   
    for (int i = 0; i < Q; i++) {
      System.out.println(ruisekiwa[rs[i]-2] - ruisekiwa[ls[i]-1]);
    }
    
  }
}
