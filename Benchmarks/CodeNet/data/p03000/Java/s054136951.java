import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] array = new int[a];
		int count = 0;
		int z = 0;
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for(int i = 0; i < array.length; i++) {
			if(z < b) {
				count++;
				z += array[i];
				continue;
			}else if(z == b) {
				count++;
				break;
			}
		}
		System.out.println(count);
	}
}