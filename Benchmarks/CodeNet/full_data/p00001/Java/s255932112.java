
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int[] hills = new int[10];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < hills.length; i++){
			hills[i] = sc.nextInt();
		}
		
		Arrays.sort(hills, 0, hills.length);
		
		for(int i = (hills.length - 1); i  > 6; i--){
			System.out.println(hills[i]);
		}
	}
}