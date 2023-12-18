import java.util.*;

class Main{
  public static int mintwo(int a,int b){
    if(a<b) return a;
    return b;
  }
  
  public static int abs(int a){
    if(a>=0) return a;
    return -a;
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[] H=new int[N];
    int[] H_C=new int[N];
    H_C[0]=0;
    
    for(int i=0;i<N;i++){
      H[i]=sc.nextInt();
    }
    
    H_C[1]=abs(H[1]-H[0]);
    
    for(int i=2;i<N;i++){
      H_C[i]=mintwo(H_C[i-2]+abs(H[i]-H[i-2]),H_C[i-1]+abs(H[i]-H[i-1]));
    }
    
    System.out.print(H_C[N-1]);
  }
}