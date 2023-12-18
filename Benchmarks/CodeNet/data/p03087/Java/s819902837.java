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
    for (int i = 0; i < Q; i++) {
      String Si = S.substring(ls[i]-1,rs[i]);
      int count = 0;
      
      int tmp;
      while((tmp = Si.indexOf("AC")) != -1) {
        count++;
        Si = Si.substring(tmp+2);
      }
      
      System.out.println(count);
    }
  }
}