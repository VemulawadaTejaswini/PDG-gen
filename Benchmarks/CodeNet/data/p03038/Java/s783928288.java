import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
 
public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        long[] cards = new long[n];
        for(int i = 0; i < n; i++) {
        	cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);
        
        HashMap<Long, Integer> a = new HashMap<>();
        int l = 0;
        for(int i = 0; i < m; i++) {
        	int b = sc.nextInt();
        	long c = sc.nextLong();
        	if(a.containsKey(c)) {
        		a.put(c, a.get(c) + b);
        	}else {
        		a.put(c, b);
        	}
        	l += b;
        }
        
        //System.out.println(l);
        
        long[] d = new long[l];
        int ind = 0;
        for(long key: a.keySet()) {
        	for(int i = ind; i < ind + a.get(key); i++) {
        		d[i] = key;
          	}
        	ind += a.get(key);
        }
        Arrays.sort(d);
        
//        for(int i = 0; i < l; i++) {
//        	System.out.print(d[i] + " ");
//        }
//        System.out.println();
        
        for(int i = 0, j = 0; i < n && j < l; i++, j++) {
        	if(cards[i] < d[l-1-j]) {
        		cards[i] = d[l-1-j];
        	}else {
        		break;
        	}
        }
        
        //System.out.println(cc + " " + dd);
        
        long sum = 0;
        for(int i = 0; i < n; i++) {
        	sum += cards[i];
        }
        System.out.println(sum);
    }
}
