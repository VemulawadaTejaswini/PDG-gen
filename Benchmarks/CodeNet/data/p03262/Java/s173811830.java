import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int x[] = new int[n+1];

		boolean xxx=true;

		for (int i=0;i<=n;++i){
			x[i]=sc.nextInt();
		}

		int min; int max;

		for (int i=0;i<=n;++i){
			for (int j=n;j>i;--j){
				min = Math.min(x[j], x[j-1]);
				max = Math.max(x[j], x[j-1]);
				x[j-1]=min;
				x[j]=max;
			}
		}

		int common=x[1]-x[0];
		int a;
		int b;
		int c;



		for (int i=1;i<n;++i){
			a=Math.max(x[i]-x[i-1], x[i+1]-x[i]);
			b=Math.min(x[i]-x[i-1], x[i+1]-x[i]);
			while ((c=a%b)!=0){
				a=b;
				b=c;
			}
			common = Math.min(common, b);
		}

		System.out.println(common);

	}
}