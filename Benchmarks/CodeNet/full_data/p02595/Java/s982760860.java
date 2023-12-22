import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		double D=sc.nextDouble();
		double X[]=new double[N];
		double Y[]=new double[N];
		for(int i=0;i<N;i++) {
			X[i]=sc.nextDouble();
			Y[i]=sc.nextDouble();
		}
		sc.close();
		int count=0;
		double distance;
		for(int i=0;i<N;i++) {
			distance=Math.sqrt(X[i]*X[i]+Y[i]*Y[i]);
			if(distance<=D)
				count++;
		}
		System.out.println(count);
	}
}
