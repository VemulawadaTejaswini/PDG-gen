import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] s = new String[n];
    for(int i = 0;i<n;i++){
      s[i] = in.next();
    }
    int ans = 0;
    for(int i = 0;i<n;i++){
      for(int j = i+1;j<n;j++){
        int xor = 0;
        for(int k = 0;k<10;k++){
          xor = xor ^ (int)s[i].charAt(k);
          xor = xor ^ (int)s[j].charAt(k);
        }
        if(xor==0){
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}
