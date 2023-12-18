import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char c[] = S.toCharArray();
    int N = S.length();
    int a = (N-1)/2;
    if(a!=1){
      for(int i=0; i < a; i++){
        if(c[i] == c[(N-1)/2-i-1]&&c[i+(N-1)/2+1] == c[N-i-1]){
          
        } else {
          System.out.println("No");
          return;
        }
      }
    } else {
      if(c[0]!=c[2]) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}