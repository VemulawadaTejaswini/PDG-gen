import java.util.*;

public class Main { 
	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in); 
	int cnt = sc.nextInt();	//count回数

		for (int i=1; i <= cnt; i++) {
			if (i % 3 == 0) {
				//3で割った余りが0なら出力
		        System.out.println(" " + i);
			} else {
				//10で割った余りが3なら出力
				if (i % 10 == 3) {
					System.out.println(" " + i);
				}
			}
		}
	}
}
