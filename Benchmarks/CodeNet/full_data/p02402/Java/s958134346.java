import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if(a > 0 && a <= 100000){
		int min = 0;
		int max = 0;
		long sum = 0;
		for(int i = 0; i < a; i++){
			int b[] = new int[a];
			b[i] = sc.nextInt();
			if(a >= -1000000 && a <= 1000000){
			sum = sum + b[i];
			if(i == 0){
			min = b[i];
			max = b[i];
			}
			if(min > b[i])min = b[i];
			if(max < b[i])max = b[i];
 			}
		}
		System.out.printf("%d %d %d\n", min,max,sum);
		}
	}
}
