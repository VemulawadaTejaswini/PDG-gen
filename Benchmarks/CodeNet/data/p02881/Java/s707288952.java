import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		//int[] P = new int[N];
		int min = N-1;
      
		for(int i=2; i<N/2; i++){
			//P[i] = sc.nextInt();
			if(N%i==0){
				int d = N/i;
				int ans = d+i-2;
				if(ans<min){
					min = ans;
                }
            }
        }
		System.out.println(min);
    }
}