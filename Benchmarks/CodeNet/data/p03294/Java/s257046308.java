import java.lang.reflect.Array;
import java.util.*;
public class Main {
	public static void main(String[] args){
		moduloSummation();
	}
	
	public static void moduloSummation() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int res = 0;
		for (int i=0; i<a.length; i++) {
			res += a[i] - 1;
		}
		System.out.println(res);
	}
}