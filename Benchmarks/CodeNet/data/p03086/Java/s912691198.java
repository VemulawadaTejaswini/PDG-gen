import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] arr = s.split("[^ACGT]");
		
		int maxLen = 0;
		for (String str : arr)
			maxLen = Math.max(maxLen, str.length());
		
		System.out.println(maxLen);
		
		sc.close();
	}
	
}


