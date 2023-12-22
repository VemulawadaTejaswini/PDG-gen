
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n,ave,counter;
		
		while(true) {
		n = sc.nextInt();
		if(n==0) {break;}
		
		ave = 0;
		counter=0;
		
		int[] income = new int[n];
		
		for(int i=0; i<n; i++) {
			income[i] = sc.nextInt();
			ave += income[i];
		}
		ave /= n;
		
		for(int j:income) {
			if(j<=ave) {
				counter++;
			}
		}
		System.out.println(counter);
		
		}
		sc.close();
	}

}

