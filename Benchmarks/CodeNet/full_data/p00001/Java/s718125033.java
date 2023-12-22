import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] a){
		int height[] = new int[10];
		for(int i = 0;i<10;i++){
			height[i] = (new Scanner(System.in)).nextInt();
		}
		Arrays.sort(height);
		System.out.println(height[9]);
		System.out.println(height[8]);
		System.out.println(height[7]);
	}
}