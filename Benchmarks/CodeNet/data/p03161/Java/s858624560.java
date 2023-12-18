import java.util.*;

class Main{
  public static int minK(int K,int[] X,int idx){
    int minimum=X[idx];
    for(int i=idx+1;i<idx+K;i++){
      if(minimum>X[i]) minimum=X[i];
    }
    return minimum;
  }
  
  public static int abs(int a){
    if(a>=0) return a;
    return -a;
  }
  
  public static int min2(int a,int b){
    return (a<b)?a:b;
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int K=sc.nextInt();
    int[] H=new int[N];//jの高さ
    int[] H_C=new int[N];//jにいくコスト
    int[] H_K=new int[K];//jからiにいくコスト
    H_C[0]=0;
    K=min2(N,K);
    
    for(int i=0;i<N;i++){
      H[i]=sc.nextInt();
    }
   
    H_C[1]=abs(H[1]-H[0]);
    
    for(int i=2;i<K;i++){
      for(int j=0;j<i;j++){
        H_K[j]=H_C[j]+abs(H[j]-H[i]);
      }
      H_C[i]=minK(i,H_K,0);
    }
    for(int i=K;i<N;i++){
      for(int j=0;j<K;j++){
        H_K[j]=H_C[i-j-1]+abs(H[i-j-1]-H[i]);
      }
      H_C[i]=minK(K,H_K,0);
    }
    
    System.out.print(H_C[N-1]);
  }
}