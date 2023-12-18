import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] b = new int[n];
		int k = sc.nextInt();
		int q = sc.nextInt();
		int a;
		for(int i = 0; i < q; i++){
			a = sc.nextInt();
			b[a-1] ++;
		}
		for(int i = 0; i < n; i++){
			if(b[i] > q-k){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}


	}

}