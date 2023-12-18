import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int [] price = new int [n];
		int [] number = new int [n];
		for(int i = 0; i < n; i++) {
			price[i] = sc.nextInt();
			number[i] = sc.nextInt();
		}
		int temp = 0;
		for(int i = 0; i < n; i++)
			for(int k = n-1; k > i; k--) {
				if(price[k-1] > price[k]) {
					temp = price[k-1];
					price[k-1] = price[k];
					price[k] = temp;
					
					temp = number[k-1];
					number[k-1] = number[k];
					number[k] = temp;
				}
			}
		long sum = 0;
		int i = 0;
		while(true) {
			if(number[i] >= m) {
				sum = sum + (long)price[i] * m;
				m = m - number[i];
				System.out.println(sum);
				break;
			}else if(number[i] < m) {
				sum = sum + (long)price[i] * number[i];
				m = m - number[i];
			}
			i++;
		}
		sc.close();
	}

}
