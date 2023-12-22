import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int[]a = new int[5];
		for(int i=0;i<5;i++) {
			a[i] = in.nextInt();
			if(a[i]==0) {
				System.out.println(i+1);
				break;
			}
		}



	}

}
