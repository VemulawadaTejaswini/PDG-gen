import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans;
        int ansTmp;
        if(N % 1000 == 0) {
        	ans = N % 1000;
        }else {
        	ansTmp = N % 1000;
        	ans = 1000 - ansTmp;
        }
      		// 文字列の入力
		System.out.println(ans);
	}
}