import java.util.Scanner;

public class Main{
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String str = s.next();
		
		int count = 0;
		for (int k = 0; k < num; k++) {
			for (int j = 0; j < k; j++) {
				for (int i = 0; i < j; i++) {
					if ((j-i != k-j) && 
						(str.charAt(i) != str.charAt(j) && 
						 str.charAt(i) != str.charAt(k) && 
						 str.charAt(k) != str.charAt(j))
						) {
						count ++;
					}
				}
			}
		}
		
		System.out.println(count);
		

	}
}