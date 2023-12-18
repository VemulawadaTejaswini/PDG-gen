import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n[] = new int[a];
		for(int i = 0; i < a; i++){
			n[i] = sc.nextInt();
		}
		int b[] = new int[a];
		int cnt;
		int m = 0;
		for(int i = a - 1; i >= 0; i--){
			cnt = 0;
			for(int j = 2; (i+1) * j <= a; j++){
				if(b[((i+1) * j)-1] == 1){
					cnt++;
				}
			}
			if((cnt + n[i]) % 2 == 0){
				b[i] = 0;
			}
			else{
				b[i] = 1;
				m++;
			}
		}
		System.out.println(m);
		for(int i = 0; i < a; i++){
			if(b[i] == 1){
				System.out.print(i+1 + " ");
			}
		}
	}
}
