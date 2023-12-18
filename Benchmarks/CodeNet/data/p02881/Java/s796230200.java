import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long N = sc.nextInt();
		long min = N-1;
      
		for(long i=2; i<N/2; i++){
			if(N%i==0){
				long d = N/i;
				long ans = d+i-2;
				if(ans<min){
					min = ans;
                }
            }
        }
		System.out.println(min);
    }
}