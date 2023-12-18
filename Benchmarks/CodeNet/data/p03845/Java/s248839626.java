import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		int m= sc.nextInt();
		for(int i = 0; i < m; i++) {
			int result = 0;
			int index = sc.nextInt()-1;
			int effect = sc.nextInt();
			for(int j = 0; j < n ;j++) {
				if(j == index) {
					result+=effect;
				}
				else {
				result += t[j];
				}
			}
			System.out.println(result);
		}
	}
}
