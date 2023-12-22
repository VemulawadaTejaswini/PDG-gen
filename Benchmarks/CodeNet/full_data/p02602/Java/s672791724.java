import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int K=s.nextInt();
    int[] A=new int[N];
    for(int i=0;i<N;i++) A[i]=s.nextInt();
    int[] point=new int[N];
    
    int p=1;
    for(int i=0;i<K;i++) p*=A[i];
    point[K-1]=p;
    
    for(int i=0;i<N-K;i++){
      p/=A[i];
      p*=A[K+i];
      point[K+i]=p;
    }
    
    for(int i=K-1;i<N-1;i++){
      if(point[i]<point[i+1]) System.out.println("Yes");
      else System.out.println("No");
    }
  }  
}