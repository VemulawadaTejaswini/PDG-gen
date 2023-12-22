import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt();
		double f;
		f=(double)a/b;
		System.out.print(a/b+" ");
		System.out.print(a%b+" ");
		System.out.printf("%.5f",f);

	}

}