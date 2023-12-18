import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		Structure[] s = new Structure[n];
		
		for(int i = 0; i < n; i++){
		    s[i] = new Structure(i+1, sc.next(), sc.nextInt());
		}
		// 計算
		int result = 0;
		Arrays.sort(s);

		// 出力
		for(int i = 0; i < n; i++){
		    System.out.println(s[i].num);
		}
		//System.out.println(result);
	}
}

class Structure implements Comparable<Structure> {
	int num;
	String city;
	int point;

	Structure(int n, String s, int p) {
		this.num = n;
		this.city = s;
		this.point = p;
	}

	@Override
	public int compareTo(Structure obj) {
	    // this > obj => 1
	    // this < obj => -1
	    // this == obj => 0
	    int order = 0;
	    
	    order = this.city.compareTo(obj.city);
	    if(order == 0){
	        order = Integer.compare(obj.point, this.point);
	    }

		return order;
	}

	public String toString() {
		return String.valueOf("");
	}
}
