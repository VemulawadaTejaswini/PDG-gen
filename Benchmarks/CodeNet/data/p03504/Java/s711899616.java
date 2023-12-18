import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int C = sc.nextInt();
		BIT bit = new BIT(100001, 2);
		int[][] tv = new int[C][100001];
		for(int i = 0; i < n ; i++){
		    int s = sc.nextInt()-1;
		    int t = sc.nextInt()-1;
		    int c = sc.nextInt()-1;
		    if(tv[c][s] == 1) s++;
		    if(tv[c][t] == 1) t--;
		    bit.add(s, t, 1);
		    tv[c][s] = 1;
		    tv[c][t] = 1;
		}
		
		// 計算
		long result = 0;
		for(int i = 0; i < 100001 ; i++){
		    result = max(result, bit.get(i));
		}
		
		// 出力
		System.out.println(result);
	}
}

class BIT {
    int n;
    long[] array;
    int mode = 1;
    
    public BIT(int n){
        this.n = n;
        this.array = new long[n+1];
    }
    
    public BIT(int n, int mode){
        this.n = n;
        this.array = new long[n+1];
        this.mode = mode;
    }
    
    public BIT(int[] a){
        this.n = a.length;
        this.array = new long[n+1];
        init(a);
    }
    public BIT(long[] a){
        this.n = a.length;
        this.array = new long[n+1];
        init(a);
    }
    
    public BIT(int[] a, int mode){
        this.n = a.length;
        this.array = new long[n+1];
        this.mode = mode;
        init(a);
    }
    public BIT(long[] a, int mode){
        this.n = a.length;
        this.array = new long[n+1];
        this.mode = mode;
        init(a);
    }
    
    public void init(int[] a){
        for(int i = 0; i < n; i++){
            add(i, a[i]);
        }
    }
    public void init(long[] a){
        for(int i = 0; i < n; i++){
            add(i, a[i]);
        }
    }

    public void add(int i, long a){
        switch(mode){
            case 1:
                for(i++; i < array.length; i += i&-i){
                    array[i] += a;
                }
                break;
                
            case 2:
                add(i, i, a);
                break;
                
            default:
        }
    }
    
    public void add(int from, int to, long a){ // mode 2 only
        switch(mode){
            case 1:
                break;
                
            case 2:
                int i = from;
                for(i++; i < array.length; i += i&-i){
                    array[i] += a;
                }
                i = to + 1;
                for(i++; i < array.length; i += i&-i){
                    array[i] -= a;
                }
                break;
                
            default:
        }
    }
    
    public long get(int i){
        switch(mode){
            case 1:
                return getSum(i, i);
            case 2:
                return getSum(i);
            default:
                return getSum(i, i);
        }
    }
    
    public long getSum(int i){ // mode 1 only
        long r = 0;
        for(i++; i > 0; i -= i&-i){
            r += array[i];
        }
        return r;
    }
    
    public long getSum(int from, int to){ // mode 1 only
        return getSum(to) - getSum(from - 1);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < n; i++){
            sb.append(get(i));
            if(i != n-1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}


