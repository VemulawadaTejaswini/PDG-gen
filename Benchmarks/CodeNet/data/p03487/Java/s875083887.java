import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		int result = 0;
		int[] cnt = new int[100000];
		for(int i = 0; i < n; i++){
		    if(a[i] > 100000 || cnt[a[i]] >= a[i]){
		        result++;
		    }else{
		        cnt[a[i]]++;
		    }
		}
		for(int i = 1; i < cnt.length; i++){
		    if(cnt[i] != 0 && cnt[i] != i){
		        result += cnt[i];
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

