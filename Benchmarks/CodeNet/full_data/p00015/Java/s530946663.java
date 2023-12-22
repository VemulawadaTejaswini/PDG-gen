import java.math.BigInteger;
import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int N=sc.nextInt();
		for(int i=0;i<N;i++){
			BigInteger a=sc.nextBigInteger(),b=sc.nextBigInteger(),sum=a.add(b);
			if(sum.toString().length()<=80){
				ln(sum);	
			}else{
				ln("overflow");
			}
		}
	}

	public static String join(double[] array, String separator) {
		StringBuilder str = new StringBuilder(array[0] + "");
		for (int i = 1; i < array.length; i++) {
			str.append(separator).append(array[i] + "");
		}
		return str.toString();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}