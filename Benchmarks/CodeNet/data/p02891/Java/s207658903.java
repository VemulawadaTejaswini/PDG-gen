import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int K = sc.nextInt();

    long ans = 0;
    int count =1;
    char prev='$';
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if(c == prev){
        count++;
      }else{
        ans += count/2;
        count=1;
        prev=c;
      }
    }
    ans += count/2;

    ans = ans * K;

    System.out.println(ans);
  }
}