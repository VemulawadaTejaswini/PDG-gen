import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int m= scan.nextInt();
		long ab[][]= new long[n][2];
		for(int i=0;i<n;i++) {
			ab[i][0]=scan.nextLong();
			ab[i][1]=scan.nextLong();
		}
		scan.close();

		long sum1 = 0;
		long sum2 = 0;
		//配列をソートする
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ab[i][0] > ab[j][0]) {
					long tmp = ab[i][0];
					ab[i][0] = ab[j][0];
					ab[j][0] = tmp;
					tmp = ab[i][1];
					ab[i][1] = ab[j][1];
					ab[j][1] = tmp;
				}
			}

			sum2 += ab[i][1]; //本数
			if( sum2 >= m) {
				sum1 = sum1+ ab[i][0]*(ab[i][1]-(sum2 - m ));
				break;
			}else {
				sum1 += ab[i][0]*ab[i][1]; // 金額
			}
		}
		System.out.println(sum1);
	}
}