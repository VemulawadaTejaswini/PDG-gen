import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = Double.parseDouble(sc.next());
		double b = Double.parseDouble(sc.next());
		double c = Double.parseDouble(sc.next());
		double k = Double.parseDouble(sc.next());

		double answer;

		if(k % 2 == 0 || k == 0){
			answer = a-b;
		}else{
			answer = b -a;
		}


		if(answer > Math.pow(10,18)){
			System.out.println("Unfair");
		}else{
			long ans = (long) answer;
		System.out.println(ans);
		}

	}

}