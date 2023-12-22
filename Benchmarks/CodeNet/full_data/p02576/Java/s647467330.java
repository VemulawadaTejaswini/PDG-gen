import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		
		int time = 0;
		
		for(int i = 1; i <= 1000; i++) {
			time += T;
			N -= X;

			if(N <= 0) {
				System.out.println(time);
				break;
			}
		}
		
	}
}