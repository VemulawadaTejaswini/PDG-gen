//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	static boolean[] targetNumbers;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H1 = sc.nextInt();
		int M1 = sc.nextInt();
		int H2 = sc.nextInt();
		int M2 = sc.nextInt();
		int K = sc.nextInt();
		int okizi = 0;
		int okihun = 0;
		if(M2>=M1) {
			okizi = H2-H1;
			okihun = M2-M1;
		}
		if(M2<M1) {
			okizi = H2-H1-1;
			okihun = 60-(M1-M2);
		}
		int yoyu = okizi*60+okihun;
		System.out.println(yoyu-K);
	}
}