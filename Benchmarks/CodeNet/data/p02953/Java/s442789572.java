import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = 0;
		boolean flag = true;
		int dif[] = new int[n-1];
		for(int i = 0; i < n-1; i++) {
			b = sc.nextInt();
				dif[i] = b - a;
			a = b;
		}
		for(int i = 0; i < n - 1; i++) {
			if(dif[i] < -1) {
				flag = false;
				break;
			}else if(dif[i] == -1){
				if(i == 0) {
					dif[0]++;
				}else {
					if(dif[i-1] <= 0) {
						flag = false;
						break;
					}else {
						dif[i]++;
					}
				}
			}
		}
		if(flag) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		sc.close();
	}
}
