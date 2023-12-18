import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		// 計算
		//int result = 0;
		HashSet<Integer> wset = new HashSet<Integer>();
		for(int i = 0; i <= f/100; i++){
		    for(int j = 0; j <= f/100; j++){
		        int w = 100*a*i + 100*b*j;
		        if(w <= f) wset.add(w); 
		    }
		}
		HashSet<Integer> sset = new HashSet<Integer>();
		for(int i = 0; i <= f; i++){
		    for(int j = 0; j <= f; j++){
		        int s = c*i + d*j;
		        if(s <= f) sset.add(s); 
		    }
		}
		int maxWS = 0;
		int maxS = 0;
		double r = -1;
		for(Integer w : wset){
		    for(Integer s : sset){
		        if(w+s <= f && s <= w/100 * e){
		            double tmp = (double)100*s/(w+s);
		            if(r < tmp){
		                r = tmp;
		                maxWS = w+s;
		                maxS = s;
		            }
		        }
		    }
		}
		
		// 出力
		System.out.println(maxWS + " " + maxS);
	}
}
