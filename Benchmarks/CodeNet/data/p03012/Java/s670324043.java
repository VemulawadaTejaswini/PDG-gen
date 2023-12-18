import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 個数の入力
		int n = sc.nextInt();
      	int[] w = new int[n];
      	int a = 0;
      	int b;
      	//重さの入力
      	for(int i=0;i<n;i++){
          w[i] = sc.nextInt();
        }
		int sum = java.util.Arrays.stream(w).sum();
      	int jud = sum;
      	int dif;
      	for(int i=0;i<n;i++){
          a = a + w[i];
          b = sum - a;
          dif = Math.abs(a-b);
          if(dif <= jud){
            jud = dif;
          }
        }
		// 出力
		System.out.println(jud);
	}
}