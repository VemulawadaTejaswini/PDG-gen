import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s = sc.next();
		char[] array = s.toCharArray();
		BIT[] bit = new BIT[26];
		for(int i = 0; i < 26; i++){
		    bit[i] = new BIT(n, 2);
		}
		for(int i = 0; i < n; i++){
		    int index = s.charAt(i) - 'a';
		    bit[index].add(i, n-1, 1);
		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++){
		    int type = sc.nextInt();
		    if(type == 1){
		        int j = sc.nextInt()-1;
		        int indexM = array[j] - 'a';
		        bit[indexM].add(j, n-1, -1);
		        String t = sc.next();
		        int indexP = t.charAt(0) - 'a';
		        bit[indexP].add(j, n-1, 1);
		        array[j] = t.charAt(0);
		    }else{
		        int l = sc.nextInt()-1;
		        int r = sc.nextInt()-1;
		        int cnt = 0;
		        for(int j = 0; j < 26; j++){
		            if(l-1 >= 0){
		                if(bit[j].get(r) - bit[j].get(l-1) > 0) cnt++;
		            }else{
		                if(bit[j].get(r) > 0) cnt++;
		            }
		        }
		        System.out.println(cnt);
		    }
		}
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


