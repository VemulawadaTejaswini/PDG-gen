//package kyoupuro;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//int str = String.valueOf(n).length();
		int sum = 0;
		int i;
		for(i=1;i<=n;i++) {
			if(String.valueOf(i).length()%2 == 1) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}