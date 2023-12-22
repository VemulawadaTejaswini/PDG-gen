import java.util.Arrays;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			int[] in = new int[8];
			for(int j = 0; j < 8; j++) in[j] = Integer.parseInt(str.substring(j, j+1));
			
			int max = max(in);
			int min = min(in);
			System.out.println(max-min);
		}
		sc.close();
	}
	
	static int min(int[] n) {
		int[] copy = Arrays.copyOf(n, n.length);
		Arrays.sort(copy);
		int result = 0;
		int digit = 1;
		for(int i = copy.length - 1; i >= 0; i--) {
			result += digit * copy[i];
			digit = digit * 10;
		}
		return result;
	}
	
	static int max(int[] n) {
		int[] copy = Arrays.copyOf(n, n.length);
		Arrays.sort(copy);
		int result = 0;
		int digit = 1;
		for(int i = 0; i < copy.length; i++) {
			result += digit * copy[i];
			digit = digit * 10;
		}
		return result;
	}
	
}