
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int[] array = new int[k];

		int count = 0;

		for(int i=0;i<k;i++) {
			array[i] = scan.nextInt();
		}
		int a = 0;

		for(int j=0;j<array.length;j++ ) {
			if(j%2 != 0 && array[j]%2 != 0) {
				count = count + 1;
			}
		}


		System.out.println(count);
	}

}