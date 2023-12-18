import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long N = sc.nextInt();
		long min = N-1;
      
		/*for(long i=2; i<(long)N/2; i++){
			if((long)N%i==0){
				long d = (long)N/i;
				long ans = d+i-2;
				if(ans<min){
					min = ans;
                }
            }
        }*/
		long i = 2L;
		long j = N/2L;
		while(i<j){
			if(N%i==0){
				j = N/i;
				long ans = j+i-2;
				if(ans<min){
					min = ans;
                }
            }
			i++;
		}
		System.out.println(min);
    }
}