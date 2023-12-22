import java.util.BitSet;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		HashMap<Integer, BitSet> member;
		HashMap<Integer, Integer> map;
		BitSet counter = new BitSet(2000);
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			if(n == 0) return;
			int r = in.nextInt();
			member = new HashMap<Integer, BitSet>();
			map = new HashMap<Integer, Integer>();
			for(int i=0; i<r; i++){
				int t = in.nextInt();
				int pc = in.nextInt();
				int mem = in.nextInt();
				int s = in.nextInt();
				if(!member.containsKey(mem)) member.put(mem, new BitSet(2000));
				if(s==1){
					map.put(pc, t);
				}else{
					member.get(mem).set(map.get(pc), t);
				}
			}
			int q = in.nextInt();
			for(int i=0; i<q; i++){
				int ts = in.nextInt();
				int te = in.nextInt();
				int mem = in.nextInt();
				if(!member.containsKey(mem)){
					System.out.println(0);
					continue;
				}
				counter.clear();
				counter.set(ts, te);
				counter.and(member.get(mem));
				System.out.println(counter.cardinality());
			}
		}
	}
}