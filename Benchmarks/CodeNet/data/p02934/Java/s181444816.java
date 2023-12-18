import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		int N = sc.nextInt();
		//String S = sc.next();
		double sum=0;
		double sum2=1;
		//char buff=S.charAt(0);
		double[] array=new double[N];
		for(int i=0;i<N;i++) {
			array[i] = 1.0/sc.nextInt();
			sum += array[i];
			sum2 *= array[i];
		}
		System.out.println(1/sum);
	}


	public static int sample() {
		return 1;
	}

}
