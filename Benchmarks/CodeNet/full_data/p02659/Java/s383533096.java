import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = Math.round(sc.nextDouble()*100);
		sc.close();
		double c = b/100;
		
		double total = a*c;
		
		System.out.println(Math.round(Math.floor(total)));
	}

}
