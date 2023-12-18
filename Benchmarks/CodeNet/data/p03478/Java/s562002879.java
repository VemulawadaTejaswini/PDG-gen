import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int sum = 0;

		int min = A%9;
		int numA = A;

		while(numA>=9){
			min = min*10+9;
			numA -=9;
		}

		int max = B%9;
		int numB = B;

		for(int x=1;x<4;x++){
			if(numB>=9){
				max += Math.pow(9,x);
			} else {
				max *= 10;
			}
		}
		if(N<max)max = N;

		for(int n = min;n<=max;n++){
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