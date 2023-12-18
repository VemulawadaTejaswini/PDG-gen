import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner vd = new Scanner(System.in);
		int a = vd.nextInt();
		int b = vd.nextInt();
		int k = vd.nextInt();
		vd.close();
		for(int i=0; i<k; ++i) System.out.println(a+i);
		for(int i=0; i<k; ++i) System.out.println((b-k+i+1));
		
	}

}
