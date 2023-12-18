import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
		
      	int N = scan.nextInt();
      	int K = scan.nextInt();
      	int Q = scan.nextInt();
      	int A[] = new int[Q];
      
      	for(int i = 0; i < Q; i++){
      		A[i] = scan.nextInt();
        }
      
      	int k[] = new int[N];
      	// ポイント初期化
      	for(int i = 0; i < N; i++){
        	k[i] = K;
        }
      
      	// 正解者ループ
      	for(int i = 0; i < A.length; i++){
        	int maru = A[i] - 1;
          	
            for(int j = 0; j < k.length; j++){
                if(maru != j){
                 	k[j] = k[j] - 1;
                }
            }
        }
      
        for(int i = 0; i < k.length; i++){
          	if(k[i] > 0){
            	System.out.println("Yes");
          	} else {
         		System.out.println("No");
            }
        }

      
    }
}
