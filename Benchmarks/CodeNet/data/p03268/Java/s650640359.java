import java.util.*;

public class Main {
	//constant
	public static final String YES = "YES";
	public static final String NO = "NO";
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//int age = sc.nextInt(); //整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		
		for (int a = 1; a <= n; a++) {
			for (int b = a; b <= n; b++) {
				for (int c = b; c <= n; c++) {
					if (((a + b) % k == 0) && ((b + c) % k == 0) && ((c + a) % k == 0)) {
						if (a == b) {
							if (a == c) {
								count += 1;
							} else {
								count += 3;
							}
						} else {
							if (a == c || b == c) {
								count += 3;
							} else {
								count += 6;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}