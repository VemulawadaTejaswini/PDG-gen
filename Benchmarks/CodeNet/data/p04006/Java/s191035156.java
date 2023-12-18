import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int N = s.nextInt();
		int x=s.nextInt();
		int[] a = new int[N];
		int[] a2=new int[2*N];
		int[] b=new int[N];
		for(int i=0;i<N;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<N;i++){
			a2[i]=a[i];
		}
		for(int i=N;i<2*N;i++){
			a2[i]=a[i-N];
		}
		
		long result;
		long sum=0;
		
		for(int i=N;i<2*N;i++){
			b[i-N]=a2[i];
			sum+=b[i-N];
		}
		result=x*0+sum;
		
		for(int c=1;c<N;c++){
			sum=0;
			for(int i=N;i<2*N;i++){
				b[i-N]=Math.min(a2[i-c], b[i-N]);
				sum+=b[i-N];
			}
			result=Math.min(result, x*c+sum);
		}
		
		System.out.println(result);
	}
}