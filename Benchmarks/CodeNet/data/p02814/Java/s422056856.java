import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //nはAの整数列の数
		int m = stdIn.nextInt(); //mはxの最大値
		int[] a = new int[n];
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		for(int i = 1; i <= m; i++) {
			for(int j = 0; j < n; j++) {
				if(((i-(0.5*a[j]))/a[j])>=0 && (i-(0.5*a[j]))/a[j] == (int)(((i-(0.5*a[j]))/a[j]))){
					System.out.print(i+" ");
					System.out.println(a[j]);
					cnt++;
					break;
				}
				
				
			}
		}
		
		
		System.out.println(cnt);
		
		
	}

}

 