import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N;
		long A[] = new long[1000000];
		N=sc.nextInt();
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		long total[] = new long[1000000];
		long B[] = new long[1000000];
		for(int i=0;i<N;i++) {
			boolean flag=true;
			for(int j=0;j<N;j++) {
				if(A[j]<0&&A[j+1]>=0&&A[j]*(-1)>=A[j+1]&&flag&&j+1<N) {
					A[j]=A[j]*(-1);
					A[j+1]=A[j+1]*(-1);
					total[i]+=A[j]+A[j+1];
					flag=false;
					j=j+1;
					
					
				
					
				}else if(A[j]<0&&A[j+1]<0&&flag&&j+1<N) {
					A[j]=A[j]*(-1);
					A[j+1]=A[j+1]*(-1);
					total[i]+=A[j]+A[j+1];
					flag=false;
					j=j+1;
				}
				else{
					total[i]+=A[j];
				}
				
				
					
				
					
				
			}
			
			
		}
	  long max=0;
	  for(int i=0;i<N;i++) {
		  
		  if(total[i]>max) {
			  max=total[i];
		  }
	  }
	  System.out.println(max);
	}
	
	
		
	}
		