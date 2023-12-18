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
      X[i]=(long)(queue.peek());
      H[i]=map.get(queue.peek());
      queue.poll();
      sum+=H[i];
      i++;
    }
    
    int index=0;
    int j=0;
    long t=0;
    
    while(sum!=0){
      for(int s=0;s<N;s++){
        if(H[s]!=0){
          index=s;
         //System.out.println(index);
          break;
        }
      }
      j=index;
      if(j==N-1){
        Ans+=(H[N-1]+A-1)/A;
        sum-=H[N-1];
      }else{
      while(X[j]<=2*D+X[index]&&j<=N-1){
        t=H[index];
        if(H[j]>H[index]){
          H[j]-=((t+A-1)/A)*A;
          sum-=((t+A-1)/A)*A;
        }else{
          sum-=H[j];
          H[j]=0;
        }
        if(j==N-1){
        	break;
        }
        j++;
      }
        //System.out.println(t);
        Ans+=(t+A-1)/A;
        //System.out.println(Ans);
      }
    }
  System.out.print(Ans);
  }
}