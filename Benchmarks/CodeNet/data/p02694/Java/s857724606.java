//B
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 100;
		int max = 10000000;
		
		for (int i = 0; i < max; i++) {
			count = (int)((double)count * 1.01);
			if (count >= x) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}