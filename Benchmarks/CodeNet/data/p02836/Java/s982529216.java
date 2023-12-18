import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    int s = S.length();
    int N = s/2;
    String S1 = "", S2 = "";
    if(s%2 == 0){
      S1 = S.substring(0,N);
      S2 = S.substring(N,s);
    }else{
      S1 = S.substring(0,N);
      S2 = S.substring(N+1, s);
    }
    
    int ans = 0;
    for(int i = 0; i < N; i++){
      if(S1.charAt(i) != S2.charAt(N-i-1)){
        ans++;
      }
    }
    System.out.println(ans);
  }
}