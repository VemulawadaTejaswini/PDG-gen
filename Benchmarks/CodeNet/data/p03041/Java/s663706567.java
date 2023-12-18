import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		String[] array = string.split(" ");
		int[] array2 = new int[2];
		for(int i=0; i<array.length; i++) {
				array2[i] = Integer.parseInt(array[i]);
		}
		array2[1] -=1;
		String line = sc.nextLine();
		String ans = line.substring(0, array2[1]) + line.substring(array2[1],array2[1]+1).toLowerCase() + line.substring(array2[1]+1);
		System.out.println(ans);

	}

}