import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int a[]=new int[N];
		int b[]=new int[N];
		long ans=1000000000*100;
		for(int i=0;i<N;i++){
			a[i]=stdIn.nextInt();
		}
		for(int i=0;i<Math.pow(2,N-1);i++){
			int x=i,max=a[0],cout=0;
			long sum=0;
			b[0]=a[0];
			for(int j=1;j<N;j++){
				b[j]=a[j];
				if(x%2==1){
					if(max>=b[j])
						sum+=max+1-b[j];
					max++;b[j]=max;
				}
				if(b[j]>b[j-1]){
					cout++;
					max=b[j];
				}
				x/=2;
			}
			if(cout>=K-1&&sum<ans)
				ans=sum;
		}
		System.out.println(ans);
	}
}
