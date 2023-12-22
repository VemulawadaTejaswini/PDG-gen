
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int min = 0;
		int max = 0;
		int mid = 0;

		if(a < b){
			min = a;
		} else {
			min = b;
		}
		if(min > c){
			min = c;
		}

		if(a > b){
			max = a;
		} else {
			max = b;
		}
		if(max < c){
			max = c;
		}

		if(min < a && a < max){
			mid = a;
		} else if(min < b && b <max){
			mid = b;
		} else if(min < c && c < max){
			mid = c;
		}

		System.out.printf("%d %d %d", min, mid, max);
	}
}