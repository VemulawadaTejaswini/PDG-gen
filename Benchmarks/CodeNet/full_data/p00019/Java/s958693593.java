import java.util.*;
public class aop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>=1 && n<=10){
			System.out.println(Math.pow(n,n));
			n = sc.nextInt();
		}
	}
}