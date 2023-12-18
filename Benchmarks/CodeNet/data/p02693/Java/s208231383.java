import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int K = sc.nextInt();
		// スペース区切りの整数の入力
		int A = sc.nextInt();
        int B = sc.nextInt();

        boolean canSuccess;
        for (int i = A; i <= B; i++) {
            canSuccess = (i % K) == 0;
            if(canSuccess) {
                break;
            }
        }

		// 出力
		System.out.println(canSuccess ? "OK" : "NG");
	}
}