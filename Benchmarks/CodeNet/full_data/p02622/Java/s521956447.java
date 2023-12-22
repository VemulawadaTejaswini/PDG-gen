import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.nextLine();
    String T = in.nextLine();
    int N = S.length(), ans = 0;
    for(int i = 0; i < N; ++i){
    if(S.charAt(i) != T.charAt(i)) ++ans;
    }
    System.out.println(ans);
  }
}