import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String a = sc.next();
    int ans =0;
    
    for(int i=1;i<=N-1;i++){
      char b = a.charAt(i);
      char c = a.charAt(i+1);
      if( (b+c) == "#." ){
        ans++;
      }
    }
    System.out.println(ans);
  }
}
