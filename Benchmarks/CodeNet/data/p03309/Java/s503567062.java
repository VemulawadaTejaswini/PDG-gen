import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		long sum=0;
		for(int i=1;i<n+1;i++) {
			a[i-1]=sc.nextInt()-i;
			sum+=a[i-1];;
		}

		double heikin=sum/n;
		int mannnaka1=(int)(heikin+0.5);
		int mannnaka2=(int)(heikin-0.5);
		long summary1=0;
		long summary2=0;
		for(int i=0;i<n;i++) {
			summary1+=zettaichi(a[i]-mannnaka1);
			summary2+=zettaichi(a[i]-mannnaka2);
		}
		long min=summary1;

		if(summary1<summary2) {
			min=saishou(summary1, mannnaka1, a, n, 1);
		}
		if(summary1>summary2) {
			min=saishou(summary2, mannnaka2, a, n, -1);
		}

		System.out.print(min);




	}



	public static int zettaichi(int a) {
		if(a>=0)
			return a;
		else
			return -a;
	}

	public static long saishou(long summaryN, int mannnaka, int[] a, int n, int sa) {
		long summary=summaryN;
		do {
			summaryN=summary;
			summary=0;
			mannnaka+=sa;
			for(int i=0;i<n;i++) {
				summary+=zettaichi(a[i]-mannnaka);
			}
		}while(summary<summaryN);

		return summaryN;
	}

}
