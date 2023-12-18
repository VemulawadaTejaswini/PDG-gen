import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		long a[] = new long[n];
		int cnt = 0;
		int b = "a".charAt(0);
		for(int i = 0; i < n; i++){
			s[i] = sc.next();
		}
		for(int i = 0; i < n; i++){
			a[i] = 1;
			for(int j = 0; j < 10; j++){
				a[i] *= s[i].charAt(j);
			}
		}


		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(a[i]== a[j]){
					cnt++;

				}

			}
		}
		System.out.print(cnt);
	}

}