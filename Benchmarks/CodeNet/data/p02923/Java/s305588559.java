import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		String[] array = new String[N];
		String str = sc.nextLine();
		str = sc.nextLine();
		array = str.split(" ");
	
		int max = 0;
		int count = 0;
		for (int i=0; i<N-1; i++) {
			count = 0;
			for (int j=i; j<N-1; j++) {
				if (Integer.parseInt(array[j]) >= Integer.parseInt(array[j+1])) {
					count++;
				}
				else {
					count = 0;
				}
			}
			if (count > max) {
				max = count;
			}
		}
		
		System.out.println(max);
		
	}

}
