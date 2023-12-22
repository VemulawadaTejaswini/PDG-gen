import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		double a[];
		double ans[];
		a = new double[6];
		ans = new double[2];
		for(int i=0;i<6;i++){
			a[i]=0;
		}
		Scanner scan = new Scanner(System.in);
		while(true){
			try{
				for(int i=0;i<6;i++){
					a[i]=scan.nextInt();
				}
				ans = cal(a);
				System.out.print(String.format("%.3f", ans[0]));
				System.out.print(" "+String.format("%.3f", ans[1]));
			}catch(NoSuchElementException ex){
				break;
			}
		}

	}

	private static double[] cal(double a[]){
		double ans[] = new double[2];
		ans[1]=(((a[2]*a[3])/a[0])-a[5])/(((a[1]*a[3])/a[0])-a[4]);
		ans[0]=(a[5]-a[4]*ans[1])/a[3];
		return ans;
	}
	

}