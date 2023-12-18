import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < 3; i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0] + a[1]);
		in.close();
	}

}
