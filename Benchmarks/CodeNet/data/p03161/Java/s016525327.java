import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int h[] = new int[N+1];
    int d[] = new int[N+1];
    h[0]=0;
    for(int i=1;i<N+1;i++){
      h[i]=sc.nextInt();
    }
    d[0]=0;
    d[1]=0;
    for(int j=0;j<K+1;j++){
    d[j+1]=Math.abs(h[j]-h[1]);
    }
    if(K<N){
    for(int i=K;i<N+1;i++){
      for(int j=1;j<K;j++){
      d[i]=Math.min(d[i-j]+Math.abs(h[i]-h[i-j]),d[i-j-1]+Math.abs(h[i]-h[i-j-1]));
      }
    }
    }
    
    System.out.println(d[N]);
    
    
  }
  

  
}