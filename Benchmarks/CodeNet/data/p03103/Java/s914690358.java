import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m= sc.nextInt();
		int count=0;
		long price=0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			map.put(sc.nextInt(),sc.nextInt());
		}
		Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);
		for( Integer nkey: map.keySet()) {
			int tempCount=map.get(nkey);
			for(int i=1;i<=tempCount;i++) {
				price+=nkey;
				count+=1;
				if(count>=m) {System.out.println(price); return;}
			}
			
			
		}
    }

}
