import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] abc = new int[3];
		for(int i = 0; i < 3; i++) {
			abc[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < 3; i++) {
			if(abc[i] == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
