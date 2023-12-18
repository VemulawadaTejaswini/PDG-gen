import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] s = new String[n];
    for(int i = 0;i<n;i++){
      s[i] = in.next();
    }
    long ans = 0;
    for(long i = 0;i<n;i++){
      for(long j = i+1;j<n;j++){
        long xor = 0;
        for(int k = 0;k<s[(int)i].length();k++){
          xor = xor ^ (int)s[(int)i].charAt(k);
          xor = xor ^ (int)s[(int)j].charAt(k);
        }
        if(xor==0){
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}
