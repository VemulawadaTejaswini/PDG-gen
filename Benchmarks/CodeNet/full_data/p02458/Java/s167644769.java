import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			TreeMap<Integer,Integer> S = new TreeMap<>();
			int c = 0;
			int q = sc.nextInt();
			for(int i = 0; i < q; i++) {
				int cmd = sc.nextInt();
				Integer x = sc.nextInt();
				if(cmd == 0) {
					Integer n = S.getOrDefault(x, 0);
					S.put(x, n+1);
					System.out.println(++c);
				}
				else if(cmd == 1){
					Integer n = S.getOrDefault(x, 0);
					System.out.println(n);
				}
				else if(cmd == 2) {
					Integer n = S.getOrDefault(x, 0);
					S.remove(x);
					c-=n;
				}
				else /* cmd == 3 */{
					int r = sc.nextInt();
					S.subMap(x,true, r, true).forEach((k,v)->{
						for(int j = 0; j <v; j++) System.out.println(k);
					});
				}
			}
		}
	}
}

