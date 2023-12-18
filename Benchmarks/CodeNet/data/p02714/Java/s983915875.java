import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		long num = s.nextLong();
		String str = s.next();
		
		int count = 0;
		for (long k = 0; k < num; k++) {
			for (long j = 0; j < k; j++) {
				for (long i = 0; i < j; i++) {
					int inti = (int)i;
					int intj = (int)j;
					int intk = (int)k;
					if ((j-i != k-j) && 
						(str.charAt(inti) != str.charAt(intj) && 
						 str.charAt(inti) != str.charAt(intk) && 
						 str.charAt(intk) != str.charAt(intj))
						) {
						count ++;
					}
					//System.out.println(String.valueOf(i)+String.valueOf(j)+String.valueOf(k));
				}
			}
		}
		
		System.out.println(count);
	}
}