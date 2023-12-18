import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String arr = sc.next();
		
		int count = 0;
		int ans = 0;
		do {
			count= 0;
			arr = arr.replaceAll("01|10", "aa");
			
			if (arr.contains("aa")) {
				count = method1(arr); 
				ans += count;
				arr = arr.replaceAll("aa", "");  
			}
		} while (count != 0);
		System.out.println(ans);
	}
	
	private static int method1(String a) {
		String[] arr = a.split("");
		int ret = 0;
		for (int i=0; i<arr.length; i++) {
			if ("a".equals(arr[i])) {
				ret++;
			}
		}
		return ret;
	}
}