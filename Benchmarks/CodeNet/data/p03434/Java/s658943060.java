import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int Alice = 0;
		int Bob = 0;
		int n = sc.nextInt();
		int []a = new int [n];
		
		for (int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();	
		}
		 Arrays.sort(a);
		 
		for(int i = 1 ; i < n ; i++) {
			Alice += a[n - i];
			Bob += a[n - i - 1];					
		}
		System.out.println((Alice - Bob));
		}
			
	}


