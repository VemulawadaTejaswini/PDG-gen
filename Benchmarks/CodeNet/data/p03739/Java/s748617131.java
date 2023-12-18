
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long[] a = null;
		try(Scanner sc = new Scanner(System.in)){
			// N入力 aスペース区切り入力
			a = new long[sc.nextInt()];
			for(int i = 0; i < a.length; i ++) {
				a[i] = sc.nextLong();
			}
		}
		
		long start = a[0];
		boolean isNaturalNum = true;
		if(start < 0) {
			isNaturalNum = false;
		}
		
		long ret = 0L;
		for(int i = 1; i < a.length; i++) {
			
			long temp2 = start + a[i];
			if(isNaturalNum) {
				if(temp2 >= 0) {
					ret += Math.abs(start + a[i]) + 1 ;
					start = -1;
				} else {
					//OK
					start = temp2;
				}
				isNaturalNum = false;
			} else {
				if(temp2 <= 0) {
					ret += Math.abs(start + a[i]) + 1;
					start = 1;
				} else {
					start = temp2;
				}
				isNaturalNum = true;
			}
			
		}
		
		System.out.println(ret);
	}
	
}
