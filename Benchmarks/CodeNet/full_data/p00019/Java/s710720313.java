import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int kaijyou = 1;
			int n = sc.nextInt();
			int k = n;
			for (int i = 0; i < n; i++) {
				kaijyou = kaijyou * k;
				k--;
			}
			System.out.println(kaijyou);
	}
}