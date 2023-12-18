
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scn=new Scanner(System.in);
		double n=scn.nextDouble();
		double []arr=new double[5];
		double min=n;
		for(int i=0;i<5;i++) {
			arr[i]=scn.nextDouble();
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		String d=new DecimalFormat("#").format(4+Math.floor((n/min))+(n%min!=0?1:0));
		
			System.out.println(d);
		
	}

}
