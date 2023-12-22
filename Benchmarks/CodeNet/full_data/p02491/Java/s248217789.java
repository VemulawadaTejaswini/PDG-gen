import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d,r;
		double f;
		
		d=a/b;
		r=a%b;
		f=(double)a/(double)b;
		
		System.out.print(d+" "+r+" ");
		System.out.println(f);

	}

}