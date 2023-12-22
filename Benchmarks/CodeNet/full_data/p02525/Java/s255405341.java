import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ave,bunsan = 0.0,sum = 0.0,bunsanmae = 0.0;
		while(true){
			int n =sc.nextInt();
			if(n == 0){
				break;
			}
			double[] a;
			a = new double[n];
			for(int i = 0;i < n;i ++){
				a[i] = sc.nextDouble();
				sum = sum + a[i];
			}
			ave = (double) sum / n;
			for(int i = 0;i < n;i++){
				bunsanmae = bunsanmae + (a[i] - ave)*(a[i] - ave);
			}
			bunsan = bunsanmae / n;
			bunsan = Math.sqrt(bunsan);
			System.out.println(bunsan);
			sum =0.0;
			bunsanmae = 0.0;
			bunsan = 0.0;
		}
	}
}