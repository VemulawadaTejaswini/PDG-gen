import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
		    b[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
		    c[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		// 計算
		long result = 0;
		for(int i = 0; i < n; i++){
		    int indexA = lowerBound(a, b[i])-1;
		    int indexC = upperBound(c, b[i]);
		    result += (long)(indexA+1)*(n-indexC);
		}
		
		// 出力
		System.out.println(result);
	}

	static int upperBound(int[] array, int n){
		int index = 0;
		int l = -1;
		int r = array.length;
		while(r-l > 1){
		    int c = (r + l)/2;
		    
		    if(n < array[c]){
		        r = c;
		    }else{
		        l = c;
		    }
		}
		index = r;
		return index;
	}
	
	static int lowerBound(int[] array, int n){
		int index = 0;
		int l = -1;
		int r = array.length;
		while(r-l > 1){
		    int c = (r + l)/2;
		    
		    if(n <= array[c]){
		        r = c;
		    }else{
		        l = c;
		    }
		}
		index = r;
		return index;
	}
}

