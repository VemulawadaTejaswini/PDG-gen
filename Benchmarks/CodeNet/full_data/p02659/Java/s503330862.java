import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		Long A = sc.nextLong();
		if(A==0){
			System.out.println("0");
			return;
		}
		double db = sc.nextDouble();
		if(db==0.0){
			System.out.println("0");
			return;
		}
		Long tmp = (long) Math.floor(db*100);
		A *= tmp;

		Long ans = (long) Math.floor(A/100);

		System.out.println(ans);
		return;
	}
}