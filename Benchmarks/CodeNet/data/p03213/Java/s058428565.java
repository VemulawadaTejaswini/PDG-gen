import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		
		// 計算
		int result = 0;
		int[] list = new int[101];
		for(int i = 1; i <= N; i++){
		    int n = i;
    		for(int m = 2; m <= sqrt(n); m++){
    		    if(n == 1) break;
    		    if(n%m == 0){
    		        while(n%m == 0){
    		            n = n/m;
    		            list[m]++;
    		        }
    		    }
    		}
    		if(n != 1) list[n]++;		    
		}
		int[] cnt = new int[5];
		for(int i : list){
		    if(i >= 74){
		        cnt[4]++;
		    }else if(i >= 24){
		        cnt[3]++;
		    }else if(i >= 14){
		        cnt[2]++;
		    }else if(i >= 4){
		        cnt[1]++;
		    }else if(i >= 2){
		        cnt[0]++;
		    }
		}
		//System.out.println(Arrays.toString(list));
		//System.out.println(Arrays.toString(cnt));
		result += cnt[4];
		//System.out.println(result);
		result += cnt[1]*(cnt[2]+cnt[3]+cnt[4]) + (cnt[2]+cnt[3]+cnt[4])*(cnt[2]+cnt[3]+cnt[4]-1);
		//System.out.println(result);
		result += (cnt[0]+cnt[1]+cnt[2])*(cnt[3]+cnt[4]) + (cnt[3]+cnt[4])*(cnt[3]+cnt[4]-1);
		//System.out.println(result);
		result += (int)(cnt[0]*combination(cnt[1]+cnt[2]+cnt[3]+cnt[4], 2) + (cnt[1]+cnt[2]+cnt[3]+cnt[4])*combination(cnt[1]+cnt[2]+cnt[3]+cnt[4]-1, 2));

		// 出力
		System.out.println(result);
	}
	
	public static long fact(long n) {
	    if(n == 0) return 1;
	    return n * fact(n - 1);
	}
	
	public static long combination(long n, long k) {
	    if(n < k) return 0;
	    return fact(n)/(fact(k)*fact(n - k));
	}
}

