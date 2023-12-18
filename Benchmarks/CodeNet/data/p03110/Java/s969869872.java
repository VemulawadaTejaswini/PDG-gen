import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Double price = 0.0;
		String u = null;
		double sum = 0;
		for(int i = 0; i < N; i++) {
			price = sc.nextDouble();
			u = sc.next();
			if(u.equals("JPY")) {
				sum += price;
			}else{
				sum += price * 380000.0;
			}
		}
		System.out.println(sum);
	}
}