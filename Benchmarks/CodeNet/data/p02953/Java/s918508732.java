import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int h[] = new int[a];
		for(int k = 0; k < a; k++){
			h[k] = sc.nextInt();
		}
		boolean flg = true;
		out:for(int i = h.length - 1; i >= 0; i--){
			for(int j = 0; j < i; j++){
				if(h[j] - h[i] >= 2){
					flg = false;
					break out;
				}
			}
		}
		if(flg){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

}