
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		double []arr=new double [n];
		double x=1;
		double sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			arr[i]=(double)(x/arr[i]);
			sum+=arr[i];
		}
		System.out.println(x/sum);
	}

}
