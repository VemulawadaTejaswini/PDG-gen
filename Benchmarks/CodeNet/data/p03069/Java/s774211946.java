import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.nextLine();
    int n1 = 0, n2 = 0;
    boolean f = false;
    for(int i = 0; i < N; i++){
      char c = S.charAt(i);
      if(f && c == '.'){
        n1++;
      }else if(c == '#' && i != N-1){
        f = true;
        n2++;
      }
    }
    System.out.println(Math.min(n1, n2));
  }
}