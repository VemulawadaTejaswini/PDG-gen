import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int k =sc.nextInt();
		
		int []h= new int [n];
		
		int sum = 0;
		
		for(int i = 0 ; i < n ;i++) {
			h[i] = sc.nextInt();
			if(h[i] >= k) {
				sum++;
			}
		}
		System.out.println(sum);
		
		
	}

}
