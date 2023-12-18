
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int abc;
		int count = 0;
		for(int i = 1; i <= 3; i++) {
			abc = sc.nextInt();
			if(abc == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
