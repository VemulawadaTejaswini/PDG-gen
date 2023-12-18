//164B(Atcoder)
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      	int K = sc.nextInt();
      	int[] d=new int[K];
      	int[][] A=new int[K][K];
      	for(int i=0;i<K;i++){
          int d[i]=sc.nextInt();
        for(int j=0;j<K;j++){
          int A[i][j]=sc.nextInt();
        }}
		
      	int count = 0;
        for (int i = 0; i < N; i++) {
          for (int j = 0; j < N; i++) {
            if (a[i][j] == 0) {
                count++;
            }
        }
 
        // 出力
        System.out.println(count);
    }
}