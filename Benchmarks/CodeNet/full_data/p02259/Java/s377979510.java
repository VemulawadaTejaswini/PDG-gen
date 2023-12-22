import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int [] num = new int[n];
		for(int i = 0; i < n; i++){
			num[i]  = sc.nextInt();

		}
		for(int i = 0; i < n-1; i++){
			for(int j = n-1; j > i; j--){
				if(num[j-1] > num[j]){
					int tmp = num[j-1];
					num[j-1] = num[j];
					num[j] = tmp;
					cnt++;
				}
			}
		}
		for(int i = 0; i < n; i++){
			System.out.print(num[i] + " ");
		}
		System.out.println("\n" + cnt);

	}
}