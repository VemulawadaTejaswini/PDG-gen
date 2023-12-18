import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		int n=st.nextInt();
		double[] a=new double[n];
		for(int i=0;i<n;i++) {
			a[i]=st.nextDouble();
		}
		double kotae=0;
		for(int i=0;i<n;i++) {
			kotae+=1.0/a[i];
		}
		double kotae1=0.0;
		kotae1=1/kotae;
		//double kotae2=1/kotae1;
		System.out.printf("%.1f",kotae1);
		//System.out.printf("%.2f",kotae2);

	}

}
