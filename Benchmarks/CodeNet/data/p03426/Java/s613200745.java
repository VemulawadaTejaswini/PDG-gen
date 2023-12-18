import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		D(sc);
	}
	
	public static void A(Scanner sc) {
		out.println(sc.nextInt()/3);
	}
	
	public static void B(Scanner sc) {
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(sc.next().charAt(0)=='Y') {
				out.println("Four");
				return;
			}
		}
		out.println("Three");
	}
	
	public static void C(Scanner sc) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			char c = sc.next().charAt(0);
			if(map.containsKey(c)) map.put(c,map.get(c)+1);
			else map.put(c,1);
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();

		HashSet<Character> lis = new HashSet<Character>(Arrays.asList('M','A','R','C','H'));
		for(Character c : map.keySet()) {
			if(lis.contains(c)) {
				arr.add(map.get(c));
			}
		}
		out.println(retksum(arr.toArray(new Integer[arr.size()]),0,3));
	}
	// arrからidx以降からk個選んで、掛け合わせる。全ての組み合わせに対して和
	public static long retksum(Integer[] arr, int idx, int k) {
		if(k==0) return 1;
		if(arr.length-idx<k) return 0;
		return arr[idx]*retksum(arr, idx+1, k-1) + retksum(arr,idx+1,k);
	}
	
	public static void D(Scanner sc) {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
		HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();
		for(int i=1;i<H+1;i++) {
			for(int j=1;j<W+1;j++) {
				map.put(sc.nextInt(),new int[] {i,j});
			}
		}
		HashMap<Integer,HashMap<Integer,Integer>> dist = makedist(map,D,H*W);
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			out.println(dist.get(l).get(r));
		}
		
	}
	// 1~hwの各要素は、start -> start+D -> 2D ,,, -> X と移動した際の魔力
	public static HashMap<Integer,HashMap<Integer,Integer>> makedist(HashMap<Integer, int[]> map, int d, int hw) {
		HashMap<Integer,HashMap<Integer,Integer>> ret = new HashMap<Integer,HashMap<Integer,Integer>>();
		for(int start = 1;start<=hw;start++) {
			HashMap<Integer,Integer> mapdist = new HashMap<Integer,Integer>();
			mapdist.put(start,0);
			for(int i=start+d;i<=hw;i+=d) {
				mapdist.put(i,mapdist.get(i-d) + Math.abs(map.get(i)[0]-map.get(i-d)[0]) + Math.abs(map.get(i)[1]-map.get(i-d)[1]));
			}
			ret.put(start,mapdist);
		}
		return ret;
	}
	
}