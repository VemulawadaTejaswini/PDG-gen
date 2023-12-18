import java.util.Arrays;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int flag = 1;
		
		int tmp = 0;

		for (int i=0; i < N; i++) {
			a[i] = sc.nextInt();
			
			if (i == 0) {
				tmp = a[i];
			} else {
				if (tmp != a[i]){
					flag = 0;
				}
			}
				
		}
		
		if(flag == 1) {
		System.out.println(0);
		}else{
			Arrays.sort(a);
			System.out.println(a[a.length -1]);
		}

		sc.close();
	}

}
