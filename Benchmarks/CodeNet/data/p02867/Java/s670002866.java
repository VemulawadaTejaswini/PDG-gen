import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int length = sc.nextInt();
		
		int[] first = new int[length];
		int[] second = new int[length];
		
		for(int i = 0; i < length; i++) {
			first[i] = sc.nextInt();
		}
		
		for(int i = 0; i < length; i++) {
			second[i] = sc.nextInt();
		}
		
		Arrays.sort(first);
		Arrays.sort(second);
		
		int tmp = 0;
		
		for(int i = 0; i < length; i++) {
			if(first[i]>second[i]) {
				tmp = 1;
			}
			
		}
		
		if(tmp == 0) 
			System.out.println("Yes");
		
		else
			System.out.println("No");
	}
}