import java.util.*;

public class Main{
  static char c = 'a';
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    func(N,"");
  }
  static void func(int N, String S){
    if(S.length() == N){
      System.out.println(S);
      return;
    }
    for(int i = S.length(), j = 0; i <= N; i++, j++){
      char d = (char)(c+j);
      S += String.valueOf(d);
      func(N, S);
    }
  }
}