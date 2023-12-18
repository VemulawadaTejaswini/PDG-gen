import java.util.*;
public class Main {
	public static void main(String[] args) {
		C();
	}
	
	public static void A() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int ret  = 0;
		for(int i=0;i<s.length();i++) {
			ret += Character.getNumericValue(s.charAt(i));
		}
		System.out.println(ret);
	}
	
	//0...M   2^M > 最小の要素 の範囲で 2^kで全て割り切れるかで２分探索 O(Nloglogminval)
	// 0...Mまで順に確かめると、O(Nlogminval)
	public static void B() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
  		}
		int maxdo = -1;
		boolean cansep = true;
		while(cansep) {
			maxdo++;
			for(int j=0;j<A.length;j++) {
				int sep = (int) Math.pow(2, maxdo);
				if(A[j]%sep != 0) {
					cansep = false;
					break;  
				}
			}
		}
		System.out.println(maxdo-1);
	}

	//出現回数が少ないものから書き換えるHashMapで文字->頻度を保持、頻度でソートして下からN-K
	public static void C() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<N;i++) {
			int key = sc.nextInt();
			if(map.containsKey(key)) map.put(key,map.get(key)+1);
			else map.put(key,1);
		}
		sc.close();
		ArrayList<Integer> lis = new ArrayList<Integer>(map.values());
		Collections.sort(lis);
		int ret = 0;
		for(int i=0;i<map.keySet().size()-K;i++) {
			ret += lis.get(i);
		}
		System.out.println(ret);
	}
}
