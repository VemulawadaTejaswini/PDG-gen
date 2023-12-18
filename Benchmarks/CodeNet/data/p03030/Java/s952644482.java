import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		

		int n = sc.nextInt();
	
		String[] strs = new String[n];
		int[] p = new int[n];
		
//		for(int i= 0;i < n;i++){
//			strs[i] = sc.next();
//			p[i] = sc.nextInt();
//		}
		
		TreeMap<String, TreeMap<Integer,Integer>> map = new TreeMap<String,TreeMap<Integer,Integer>>();
		for(int i = 0;i < n;i++){
			String str = sc.next();
			int num = sc.nextInt();		
			TreeMap<Integer,Integer> submap = map.getOrDefault(str,new TreeMap<>(Comparator.reverseOrder()));
			submap.put(num, i);
			map.put(str, submap);
		}
		
		for(String ss:map.keySet()){
			for(int ans:map.get(ss).values()){
				System.out.println(ans+1);
			}
		}
		
		
		

		
		
	}
	
	static void allsum(int[] A){
		long ans = 0;
		for(int i = 0;i < A.length;i++){
//			System.out.println(A[i]);
			ans += A[i];
		}
		System.out.print(ans);
	}


	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}





}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return  otherpair.end - end;
	}
}


