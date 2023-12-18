import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] v = new int[n];
		int sumT = 0;
		for(int i = 0; i < n; i++){
		    t[i] = sc.nextInt();
		    sumT += t[i];
		}
		for(int i = 0; i < n; i++){
		    v[i] = sc.nextInt();
		}
		
		// 計算
		double result = 0;
		int[] minV = new int[sumT+1];
		int index = 0;
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < t[i]; j++){
		        index++;
		        if(index == sumT) continue;
		        if(j < t[i]-1){
		            minV[index] = v[i];
		        }else{
		            minV[index] = min(v[i], v[i+1]);
		        }
		    }
		}
		int[] minA = new int[sumT+1];
		for(int i = 0; i < (sumT+2)/2; i++){
		    minA[i] = i;
		    minA[sumT-i] = i;
		}
		int[] r = new int[sumT+1];
		for(int i = 1; i < sumT+1; i++){
		    r[i] = min(r[i-1]+1, min(minV[i], minA[i]));
		}
		int[] l = new int[sumT+1];
		for(int i = 1; i < sumT+1; i++){
		    l[sumT-i] = min(l[sumT-i+1]+1, min(minV[sumT-i], minA[sumT-i]));
		}
		int[] res = new int[sumT+1];
		for(int i = 0; i < sumT+1; i++){
		    res[i] = min(r[i], l[i]);
		}
		
		for(int i = 1; i < sumT+1; i++){
		    result += (double)abs(res[i]-res[i-1])/2 + min(res[i], res[i-1]);
		}
		for(int i = 1; i < sumT+1; i++){
		    if(res[i] == res[i-1] && res[i] < minV[i] && res[i-1] < minV[i-1]) result += 0.25;
		}
		//System.out.println(Arrays.toString(minV));
		//System.out.println(Arrays.toString(minA));
		//System.out.println(Arrays.toString(r));
		//System.out.println(Arrays.toString(l));
		//System.out.println(Arrays.toString(res));
		
		// 出力
		System.out.println(result);
	}
}

