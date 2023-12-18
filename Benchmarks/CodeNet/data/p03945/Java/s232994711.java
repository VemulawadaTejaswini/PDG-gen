import java.util.Scanner;

public class Main {
  static String S;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    S = sc.next();

    int n = S.length(), count = 0;
    for(int i = 0; i < n - 1; i++){
      char f = S.charAt(i), s = S.charAt(i + 1);
      if((f == 'B' && s == 'W') || (f == 'W' && s == 'B')){
        ++count;
        ++i;
      }
    }

    int ans = 0;
    if(count >= 1){
      ans = 2 * count - 1;
    }

    System.out.println(ans);
  }
}
