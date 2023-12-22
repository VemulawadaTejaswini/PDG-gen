import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Long> tableA= new ArrayList<Long>();
	static ArrayList<Long> tableB= new ArrayList<Long>();
	static int numA;
	static int numB;
	static int timeLimit;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		numA = sc.nextInt();
		numB = sc.nextInt();
		timeLimit = sc.nextInt();

		long tmp;
		// A棚のN冊の本を読む時間を格納する
		tmp = 0;
		tableA.add(tmp);
		for(int i=1;i<=numA;i++) {
			tmp = tmp + sc.nextInt();
			tableA.add(tmp);
		}

		// B棚のN冊の本を読む時間を格納する
		tmp = 0;
		tableB.add(tmp);
		for(int i=1;i<=numB;i++) {
			tmp = tmp + sc.nextInt();
			tableB.add(tmp);
		}
		sc.close();

		int result = 0;
		for(int i=0;i <= numA+numB;i++) {
			for(int j=0;j<=i;j++) {

				if(tableA.size() <= j) {
					continue;
				}

				if(tableB.size() <= (i-j)) {
					continue;
				}

				// i冊の本を読める組み合わせが見つかったらそこで処理終了
				if( tableA.get(j) + tableB.get(i-j) <= timeLimit) {
					result = i;
					continue;
				}
			}
			//どの組み合わせでも本を読み切ることが出来ない場合は処理終了
			if(result < i) {
				break;
			}
		}

		System.out.println(result);

	}

}