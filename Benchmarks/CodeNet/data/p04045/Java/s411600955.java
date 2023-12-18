import java.util.*;
public class Main {
	public static boolean containsInArray(int []arr, int a) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == a) {
				return true;
			}
		}
		return false;
	}

	public static int update(int n, int[] arr) {
		int a = 0;
		String s = String.valueOf(n);
		for(int i = 0; i < s.length(); i++) {
			int b = Character.getNumericValue(s.charAt(i));
			//System.out.println("b :" + b);
			if(containsInArray(arr, b)) {
				while(containsInArray(arr, b)) {
					b++;
				}
			}
			a += b;
			a *= 10;
			//System.out.println("a :" + a);
		}
		return a/10;
	}

	public static boolean validate(int n, int[] arr) {
		//System.out.println("aaaaaaa");	
		while(n > 0) {
			int a = n%10;
			if(containsInArray(arr, a)) {
				return false;
			}
			n /= 10;
		}
		return true;
	}

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[k];
		for(int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}

		if(validate(n, arr)) {
			System.out.println(n);	
		}
		else {
			while(!validate(n, arr)) {
				n = update(n, arr);
			}
			System.out.println(n);
		}
	}
}