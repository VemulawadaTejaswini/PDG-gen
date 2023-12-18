import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		// argumentの取得
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
        int K = s.nextInt();
      
        // 回答
        int answer = K;
      
		for (int i=1; i < N; i++){
          answer *= (K - 1);
        }
      
        System.out.println(answer);
	
	} 
}