import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		double X = Math.floor(N / 1.08);
		if (Math.floor(X * 1.08) == N){
			System.out.println((int)X);
		} else {
			if(Math.floor((X+1) * 1.08) == N){
				System.out.println((int)X+1);
			} else {
				System.out.println(":(");
			}
		}
	}
}