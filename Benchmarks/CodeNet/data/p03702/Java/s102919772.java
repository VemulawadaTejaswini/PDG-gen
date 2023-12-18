import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int A=sc.nextInt();
    int B=sc.nextInt();
    int[] h=new int[n];
    int ans =0;
    
    for(int i=0;i<N;i++){
      h[i]=sc.nextInt();
    }

    while(h[N-1] < 0){
      ans++;
      Arrays.sort(h);
      h[N-1] -= A;
      for(int i=0;i<N-1;i++){
        h[i] -= B;
      }
      Arrays.sort(h);
      if(h[N-1] < 0){
        break;
      }
    }
    System.out.println(ans);
  }
}