import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		BigDecimal[] array = new BigDecimal[200000];
		BigDecimal one = new BigDecimal("1");
		Arrays.fill(array,one);
		for(int i=0;i<n;i++) {
			array[i] = BigDecimal.valueOf(sc.nextInt());
		}
		sc.close();

		BigDecimal[] bigArray = new BigDecimal[n-k+1];
		bigArray[0] = BigDecimal.valueOf(1);

		for(int i=0;i<k;i++) {
			bigArray[0] = bigArray[0].multiply(array[i]);
		}

		for(int i=0;i<n-k;i++) {
			bigArray[i+1] = bigArray[i].divide(array[i]).multiply(array[i+k]);
			if(bigArray[i].compareTo(bigArray[i+1])==-1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}