import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int T=sc.nextInt();
    int[] t=new int[N];
    int ans = 0;
    
    for(int i=0;i<N;i++){
      t[i]=sc.nextInt();
    }
 
    if(N > 1){
      ans = t[1] - t[0];
    }
    for(int j=1;j<N-1;j++){
      if(T >(t[j+1] - t[j])){
        ans += (t[j+1] - t[j]);
      }else{
        ans += T;
      }
    }
    ans += T;

    System.out.println(ans);
  }
}