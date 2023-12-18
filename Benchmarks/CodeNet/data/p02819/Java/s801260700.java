import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		boolean ss = true;
		while(ss) {
			if (v == 2) {
		    System.out.println(v);
		} else {
		    boolean issosu = true;
		    for (int u = 2; u < v; u++) {
		        if (v % u == 0) {
		            issosu = false;
		        }
		    }

		    if (issosu) {
		        System.out.println(v);
		        ss =  false;
		    } else {
		    	v += 1;
		    }
		}
		}
	}

}