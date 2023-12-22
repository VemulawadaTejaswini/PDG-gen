import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException{
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n <= 0) break;
			int[] scores = new int[n];
			int sum = 0, max = 0, min = 10000;
			int in;
			for(int i = 0 ; i < n; i++){
				in = sc.nextInt();
				sum += in;
				max = Math.max(max, in);
				min = Math.min(min, in);
			}
			System.out.println(1.0 * (sum - max - min) / (n - 2.0));
		}
	}
}