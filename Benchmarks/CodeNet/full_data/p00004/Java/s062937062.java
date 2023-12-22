import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		 DecimalFormat df=new DecimalFormat();
		 df.applyPattern("0");
		 df.setMaximumFractionDigits(3);
	     df.setMinimumFractionDigits(3);
		while(scan.hasNext()){
			double a[] = new double[6];
			for(int i=0;i <=5;i++){
				 a[i] = Double.parseDouble(scan.next());
			}
			double ans1,ans2;
			String result1,result2;
			ans1 = (a[1]*a[5] - a[2]*a[4]) / (a[1]*a[3] - a[0]*a[4]);
			ans2 = (a[0]*a[5] - a[2]*a[3]) / (a[0]*a[4] - a[1]*a[3]);
			Double objnum1=new Double(ans1);
			Double objnum2=new Double(ans2);
			result1=df.format(objnum1);
			result2=df.format(objnum2);
			System.out.println(result1+" "+result2);
		}
		System.exit(0);
	}
}