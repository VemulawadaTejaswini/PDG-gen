import java.util.Scanner;

public class Main{
	
	private static int[] numbers;
	public static long ans=0;
		
	
	
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		char[] inputString = scanner.next().toCharArray();
		numbers = new int[inputString.length];
		
		for (int i = 0; i < inputString.length; i++) {
			String string = String.valueOf(inputString[i]);
			numbers[i] = Integer.parseInt(string);
		}
		
		long ans = 0;
		
		for (int i = 0; i < Math.pow(2, numbers.length-1); i++) {
			int add = numbers[0];
			for (int j = 0; j < numbers.length-1; j++) {
				if ((1&i>>j) == 1) {
					ans += add;
					add = numbers[j+1];
				}else {
					add = add*10 + numbers[j+1];
				}				
			}
			ans += add;
		}
		System.out.println(ans);
	}
}