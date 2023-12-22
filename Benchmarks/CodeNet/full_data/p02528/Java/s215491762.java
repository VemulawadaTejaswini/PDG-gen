import java.util.Arrays;
import java.util.Scanner;


public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0; i < a.length; i++) {
			int x = sc.nextInt();
			x*=-1;
			a[i]=x;
		}
		Arrays.sort(a);
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			sb.append(" "+a[i]);
//			System.out.println(a[i]);
			
		}
		System.out.println(sb.toString().substring(1));
	}

}