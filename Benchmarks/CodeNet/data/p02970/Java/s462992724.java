
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int count=0;
		
		for(int i=0;i<N;i+=D*2+1) {
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}
