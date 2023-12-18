import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] array = new int[a];
		int count = 1;
		int z = 0;
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for(int i = 0; i < array.length; i++) {
			z += array[i];
			if(z <= b) {
				count++;
			}	
		}
		System.out.println(count);
	}
}