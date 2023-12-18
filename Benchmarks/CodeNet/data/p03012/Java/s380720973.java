import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int w[] = new int[n];
    int sum = 0;
    int undersum=0;
    int oversum=0;
    int T = 100;
    int d[] = new int[100];
    for(int i=0;i<n;i++){
      w[i] = sc.nextInt();
    }
    Arrays.sort(w);
    for(int i=0;i<n;i++){
      sum+=w[i];
    }
    for(int k=1;k<T+1;k++){
      for(int i=0;i<n;i++){
        if(w[i]<=k){
          undersum+=w[i];
        }else{
          oversum+=w[i];
        }
      }
      d[k-1]=Math.abs(oversum-undersum);
      oversum=0;
      undersum=0;
    }
    Arrays.sort(d);
    System.out.println(d[0]);
    
  }
}