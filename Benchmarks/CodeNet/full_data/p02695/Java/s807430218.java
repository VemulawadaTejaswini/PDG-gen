import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int Q=stdIn.nextInt();
		int A[]=new int[N];
		boolean key[]=new boolean[N];
		int a[][]=new int[Q][4];
		boolean fin=true;
		int now=N-1,cout=0;
		long max=0;
		for(int i=0;i<Q;i++){
			a[i][0]=stdIn.nextInt()-1;
			a[i][1]=stdIn.nextInt()-1;
			a[i][2]=stdIn.nextInt();
			a[i][3]=stdIn.nextInt();
		}
		A[0]=0;A[N-1]=-1;
		while(fin){
			for(int i=0;i<N;i++){
				if(i==N-1){
					if(key[i])
						A[i]++;
					else{
						key[i]=true;
						A[i]=A[i-1];
					}
					if(A[i]==M-1){
						key[i]=false;
						if(now==i)
							now--;
					}
				}
				else
					if(i==now){
						if(key[i])
							A[i]++;
						else{
							key[i]=true;
							if(i!=0)
								A[i]=A[i-1];
						}
						if(A[i]==M-1){
							if(i==0){
								fin=false;
								break;
							}
							key[i]=false;
							now--;
						}
						else
							now++;
					}
			}
			long sum=0;
			for(int i=0;i<Q;i++){
				if(A[a[i][1]]-A[a[i][0]]==a[i][2])
					sum+=a[i][3];
			}
			if(sum>max)
				max=sum;
		}
		System.out.println(max);
	}
}
