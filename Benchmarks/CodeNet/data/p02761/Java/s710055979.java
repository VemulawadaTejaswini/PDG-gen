import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int[] s = new int[M];
    int[] c = new int[M];
    
    for(int i=0;i<M;i++){
      s[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    
    int[] a = new int[N];
    for(int i=0;i<N;i++){
      a[i] = -1;
    }
    
    for(int k=0;k<M;k++){   
      if(a[s[k]-1] == -1){
        a[s[k]-1] = c[k];
      }
      else if(a[s[k]-1] != c[k]){
        System.out.println(-1);
        return;        
      }

    }
            
     if(a[N-1]== -1){
   		System.out.println(-1);
        return;
      }
      
      int ans = 0;
      for(int j=0;j<N;j++){
        if(a[j] != -1)
      		ans += a[j] * Math.pow(10,N-j-1);
      }
      
      System.out.println(ans);
      return;
  }
}
