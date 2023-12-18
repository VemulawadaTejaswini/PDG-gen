import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int sum = 0;

		for(int n=0;n<N;n++){
			int work = n;
			int worksum = 0;
			for(int m=0;m<4&&work>0;m++){
				worksum += work%10;
				work /= 10;
			}
			if(worksum>=A&&worksum<=B){
				sum += n;
			}
		}

		// 出力
		System.out.println(sum);
	}
}