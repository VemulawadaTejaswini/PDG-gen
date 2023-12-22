import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			long kazu[] = new long[n];
			long jyo =1;
			for(int i = 0; i < kazu.length; i++) {
				kazu[i] = sc.nextLong();
				jyo *= kazu[i];
			}
			if(jyo / 1000000000 > 100000000) {
				jyo = -1;
			}
			System.out.println(jyo);
	}

}