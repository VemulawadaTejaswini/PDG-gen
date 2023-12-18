//164B(Atcoder)
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      	int K = sc.nextInt();
      	int[] A=new int[N];
      	
      	for(int i=0;i<K;i++){
          int d=sc.nextInt();
        for(int j=0;j<d;j++){
          A[sc.nextInt() - 1] += 1;
        }}
		
      	int count = 0;
        for (int i = 0; i < N; i++) {
          
            if (A[i] == 0) {
                count++;
            
        }
      }
 
        // 出力
        System.out.println(count);
    }
}