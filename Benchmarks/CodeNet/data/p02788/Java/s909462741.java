import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
    long D=sc.nextLong();
    long A=sc.nextLong();
    long[] X=new long[N];
    long[] H=new long[N];
	Queue queue=new PriorityQueue();
    Map<Long,Long>map=new HashMap<>();
    long Ans=0L;
    long sum=0L;
    
    for(int i=0;i<N;i++){
      long a=sc.nextLong();
      long b=sc.nextLong();
	  queue.add(a);
      map.put(a,b);
    }
    
    int i=0;
    long k=0;
    while(!queue.isEmpty()){
      k=queue.poll();
      X[i]=k;
      H[i]=map.get(k);
      sum+=H[i];
      i++;
    }
    
    int index=0;
    int j=0;
    
    while(sum!=0){
      for(int i=0;i<N;i++){
        if(H[i]!=0){
          index=i;
          break;
        }
      }
      j=index;
      while(X[j]<=2*D+X[index]){
        if(H[j]>H[index]){
          H[j]-=H[index];
          sum-=H[index];
        }else{
          sum-=H[j];
          H[j]=0;
        }
        j++;
      }
      Ans+=H[index];
      
      
    }
  System.out.print(Ans);
  }
}