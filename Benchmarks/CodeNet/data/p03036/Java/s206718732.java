import java.util.Scanner;

/**
 * @author yoshida3203
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int D=sc.nextInt();
		int X=sc.nextInt();

		sc.close();
		//char[]S=sc.next().toCharArray();

		for(int i=0;i<10;i++){
			int nextX=r*X-D;
			X=nextX;
			System.out.println(X);

		}

	}
}
