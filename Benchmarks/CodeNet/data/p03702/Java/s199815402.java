import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    long A=sc.nextLong();
    long B=sc.nextLong();
    long[] h=new long[N];
    int ans =0;
    
    for(int i=0;i<N;i++){
      h[i]=sc.nextLong();
    }
 
    while(h[N-1] > 0){
      ans++;
      Arrays.sort(h);
      h[N-1] -= A;
      for(int i=0;i<N-1;i++){
        h[i] -= B;
      }
      Arrays.sort(h);
    }
    System.out.println(ans);
  }
}