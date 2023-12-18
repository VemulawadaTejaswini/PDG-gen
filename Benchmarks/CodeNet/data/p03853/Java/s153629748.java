import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		
		String array[] = new String[h];
		
		for(int i = 1; i < h; i++){
			array[i] = scan.next();
		}
		for(int i = 0; i< array.length; i++){
				System.out.println(array[i]);
				System.out.println(array[i]);
		}
	}

}
