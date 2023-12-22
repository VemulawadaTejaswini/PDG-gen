import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int p=scan.nextInt();
		int[] x=new int[p];
		int[] y=new int[p];
		double sum;
		for(int i=0;i<p;i++){
			x[i]=scan.nextInt();
		}
		for(int i=0;i<p;i++){
			y[i]=scan.nextInt();
		}
		sum=0;
		for(int i=0;i<p;i++){
			sum+=Math.abs(x[i]-y[i]);
		}
		System.out.printf("%.6f\n",sum);
		sum=0;
		for(int i=0;i<p;i++){
			sum+=Math.pow(Math.abs(x[i]-y[i]),2);
		}
		System.out.printf("%.6f\n",Math.sqrt(sum));
		sum=0;
		for(int i=0;i<p;i++){
			sum+=Math.pow(Math.abs(x[i]-y[i]),3);
		}
		System.out.printf("%.6f\n",Math.cbrt(sum));
		sum=Math.abs(x[0]-y[0]);
		for(int i=1;i<p;i++){
			sum=Math.max(sum,Math.abs(x[i]-y[i]));
		}
		System.out.printf("%.6f\n",sum);
		scan.close();
	}

}