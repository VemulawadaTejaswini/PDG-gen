import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int flag = 0;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		while(flag == 0) {
			for(int i = 0; i < n; i++) {
				if(a[i] % 2 == 0) {
					a[i] /= 2;
				} else {
					flag = 1;
					break;
				}
			}
			if(flag != 1) {
				count += 1;
			}
		}
		
		System.out.println(count);
		
	}

}