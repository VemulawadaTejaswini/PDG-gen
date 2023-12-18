import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);      	
		int N = sc.nextInt();      	 
      	int K = sc.nextInt();
      	Double[] P= new Double [N];
      	Double[] PE= new Double [N];
      	int tmp,totle;
      	double Max,TmpMax;
      	for(int i=0 ;i<N;i++)
        {
          	P[i]=sc.nextDouble();          	
        }
      	for(int i=0; i<N;i++)
        {
          	tmp=1;
          	totle=1;
          	while (tmp<P[i])
            {
              tmp+=1;
              totle = totle+tmp;              
            }
          	PE[i]= totle/P[i];
        }
      	TmpMax=0;
      	Max=0;
      	for(int i =0;i<N-(K-1);i++)
        {
          TmpMax=0;
          for(int j =0;j<K;j++)
          {
            TmpMax+=PE[i+j];
          }
          if (TmpMax>Max)
          {
            Max=TmpMax;
          }
        }
      	
      	System.out.println(String.format("%.12f",Max));
	}
}