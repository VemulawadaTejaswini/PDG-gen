import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] c = new int[N+1];
    int[] s = new int[N+1];
    int[] f = new int[N+1];
    for(int i=1;i<N;i++){
      c[i] = sc.nextInt();
      s[i] = sc.nextInt();
      f[i] = sc.nextInt();
    }
    for(int i=1; i<=N-1; i++){
      long ans = 0;
      for(int j=i;j<=N-1;j++){
        if(ans <= s[j]){
          ans = s[j];
          ans += c[j];
        }
        else{
          long remain = (ans-s[j])&f[j];
          if(remain!=0) ans += f[j]-remain;
          ans += c[j]; 
        }
      }
      System.out.println(ans);  
    }
    System.out.println(0);
  }
}