import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
class Main{


	static final int MOD = 1000000007;

	static	ArrayList<TreeNode> tree;
	static HashSet<Integer> set;
	static int[] ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		

		
		TreeMap<Character, ArrayList<Integer>> data = new TreeMap<Character,ArrayList<Integer>>();
		for(int i = 0;i < s.length;i++){
			char c = s[i];
			ArrayList<Integer> list = data.getOrDefault(c, new ArrayList<Integer>());
			list.add(i);
			data.put(c, list);
		}
		
//		for(int i = 0;i < s.length;i++){
//			char c = s[i];
//			ArrayList<Integer> test = data.get(c);
//			System.out.println(c);
//			for(int j = 0;j < test.size();j++){
//				System.out.print(test.get(j) + " ");
//			}
//			System.out.println();
//			
//		}
//		

		long ans = 0;
		int index = -1;
		for(int i = 0;i < t.length;i++){
			char c = t[i];
//			
//			ArrayList<Integer> test = data.get(c);
//			System.out.println(c);
//			for(int j = 0;j < test.size();j++){
//				System.out.print(test.get(j) + " ");
//			}
//			System.out.println();
			int next = lowerbond(index,data.get(c));				//次の文字の位置
			if(next == -1){
				next = lowerbond(-1,data.get(c));
				ans += s.length;
			}
			if(next == -1){				//不可能
				ans = -1;
				System.out.println(ans);
				return;
			}
//			System.out.println(i + " " + next);
			index = next;
			
		}
		
		ans += index+1;
		System.out.print(ans);

	}





	static int upperbond(int k,ArrayList<Integer> data){		//kより小さい最大の値をdataの中から探し、返す二分探索
		if(data == null){
			return -1;
		}
		int max = data.size();
		int min = -1;
//		System.out.println("upper");
//		System.out.println("k "+k);
//		for(int i = 0;i < data.size();i++){
//			System.out.println(data.get(i));
//		}

		
		//		if(min == data.length-1){
		//			if(data[min] > k){
		//				return min;
		//			}
		//		}

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data.get(mid) >= k){
				max = mid;
			}else{
				min = mid;
			}
		}

		
		if(min != -1){
			min = data.get(min);
		}
		
//		System.out.println(max);
		return min;
	}

	static int lowerbond(int k,ArrayList<Integer> data){		//kより大きい最小の値をdataの中から探し、返す二分探索
		if(data == null){
			return -1;
		}
//		System.out.println("lo");
//		System.out.println("lo");
		int max = data.size();
		int min = -1;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data.get(mid) > k){
				max = mid;
			}else{
				min = mid;
			}
		}

		if(max >= data.size()){				//最大の
			max = -1;
		}else{
			max = data.get(max);
		}
//		System.out.println(max);
		
//		System.out.println(min);
		return max;
	}



	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}




}

class TreeNode{
	int value;
	int sum;
	ArrayList<TreeNode> childlen;

	public TreeNode(int v,int s) {
		this.value = v;
		this.sum = s;
		this.childlen = new ArrayList<TreeNode>();
	}


}


class Edge  implements Comparable{

	int index;
	HashSet<Integer> hen;
	HashSet<Integer> used;
	HashMap<Integer, Integer> map;
	int size;


	public Edge(int index) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.index = index;
		hen = new HashSet();
		used = new HashSet<Integer>();
		map = new HashMap<Integer,Integer>();
	}

	public int compareTo(Object other) {
		Edge otherpair = (Edge)other;

		return   otherpair.hen.size() - hen.size();
	}
}

class Pair implements Comparable{
	int from;
	int end;
	public Pair(int from,int end) {
		this.from = from;
		this.end = end;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return  from - otherpair.from;
	}








}




