import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 人数の入力
		int ninzu = sc.nextInt();
		int okasi = sc.nextInt();
      	int[] sum = new int[ninzu];
      	for (int i=0; i<okasi; i++){
        	int c = sc.nextInt();
          	for (int j=0; j<c; j++){
              int d = sc.nextInt() - 1;
              sum[d] = 1;
            }
        }
      	int ans = 0;
      	for (int i=0; i<sum.length; i++) {
          if (sum[i] == 0) {
            ans += 1;
          }
        }
		// 出力
		System.out.println(ans);
	}
}