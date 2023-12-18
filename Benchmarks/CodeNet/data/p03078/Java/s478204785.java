import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		Long[] a = new Long[x];
		Long[] b = new Long[y];
		Long[] c = new Long[z];
		for(int i = 0; i < x; i++){
		    a[i] = sc.nextLong();
		}
		for(int i = 0; i < y; i++){
		    b[i] = sc.nextLong();
		}
		for(int i = 0; i < z; i++){
		    c[i] = sc.nextLong();
		}
		
		// 計算
		Arrays.sort(a, Comparator.reverseOrder());
		Arrays.sort(b, Comparator.reverseOrder());
		Arrays.sort(c, Comparator.reverseOrder());
		PriorityQueue<Structure> pq = new PriorityQueue<Structure>();
		HashSet<Structure> hs = new HashSet<Structure>();
		Structure s = new Structure(a[0] + b[0] + c[0], 0, 0, 0);
		pq.add(s);
		hs.add(s);
		for(int i = 0; i < k; i++){
		    Structure now = pq.poll();
		    System.out.println(now.sum);
		    if(now.a_i < x - 1){
		        Structure sA = new Structure(
		            a[now.a_i + 1] + b[now.b_i] + c[now.c_i],
		            now.a_i + 1,
		            now.b_i,
		            now.c_i);
		        if(!hs.contains(sA)) {pq.add(sA); hs.add(sA);}
		    }
		    if(now.b_i < y - 1){
		        Structure sB = new Structure(
		            a[now.a_i] + b[now.b_i + 1] + c[now.c_i],
		            now.a_i,
		            now.b_i + 1,
		            now.c_i);
		        if(!hs.contains(sB)) {pq.add(sB); hs.add(sB);}
		    }
		    if(now.c_i < z - 1){
		        Structure sC = new Structure(
		            a[now.a_i] + b[now.b_i] + c[now.c_i + 1],
		            now.a_i,
		            now.b_i,
		            now.c_i + 1);
		        if(!hs.contains(sC)) {pq.add(sC); hs.add(sC);}
		    }
		    
		}
		
		// 出力
		//System.out.println(result);
        
	}
}

class Structure implements Comparable<Structure> {
	long sum;
	int a_i;
	int b_i;
	int c_i;

	Structure(long sum, int a_i, int b_i, int c_i) {
		this.sum = sum;
		this.a_i = a_i;
		this.b_i = b_i;
		this.c_i = c_i;
	}

	@Override
	public int compareTo(Structure obj) {
	    // this > obj => 1
	    // this < obj => -1
	    // this == obj => 0
	    int order = 0;
	    
		// 第1ソートキー
	    order = Long.compare(obj.sum, this.sum);

		return order;
	}
	
	@Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        if(this == obj){
            return true;
        }

        if(this.getClass() != obj.getClass()){
            return false;
        }

        Structure structure = (Structure)obj;
        boolean bool = 
            this.sum == structure.sum &&
            this.a_i == structure.a_i &&
            this.b_i == structure.b_i &&
            this.c_i == structure.c_i;
        return bool;
    }
    
    @Override
    public int hashCode(){
        int hc = 17;
        hc = 31 * hc + (int)(sum^(sum>>32));
        hc = 31 * hc + (int)a_i;
        hc = 31 * hc + (int)b_i;
        hc = 31 * hc + (int)c_i;
        return hc;
    }

	public String toString() {
		return String.valueOf(this.sum + " " + this.a_i + " " + this.b_i + " " + this.c_i);
	}
}
