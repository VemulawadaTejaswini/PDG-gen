import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    char[]ss = S.toCharArray();
    char[]tt = T.toCharArray();

    for(int i=0; i<N; i++) {
      System.out.print(ss[i]);
      System.out.print(tt[i]);
    }
}
}