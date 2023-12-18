import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] t = new int[n];
		int[] d = new int[n];

		ArrayList<Pair> pairs = new ArrayList<Pair>();
		for(int i = 0;i < n;i++){
			t[i] = sc.nextInt();
			d[i] = sc.nextInt();
			Pair pair = new Pair();
			pair.from = t[i];
			pair.end = d[i];
			pairs.add(pair);
		}

		Collections.sort(pairs,Comparator.reverseOrder());
		
		int[] cc = new int[100000000];

		int p = pairs.get(0).from;
		cc[p]++;
		pairs.get(0).from = 1;
		for(int i = 1;i < n;i++){
			if(cc[ pairs.get(i).from ] > 0){			//すでに最高値がある時
				pairs.get(i).from = 0;
			}else{
				cc[pairs.get(i).from]++;				//新しい寿司の中で最高値
				p = pairs.get(i).from;	
				pairs.get(i).from = 1;
			}

		}

		long ans = 0;
		int syurui = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for(int i = 0;i < k;i++){
			ans += pairs.get(i).end;
			if(pairs.get(i).from == 0){			//最大値じゃない時,
				queue.add(pairs.get(i).end);
			}else{
				syurui += pairs.get(i).from;
			}

		}	


		long[] maxans = new long[k+1];
		maxans[syurui] = ans;


		int index = k;			//現在index
		long sub = ans;
		while(syurui < k){
			for(int j = index;j < n;j++){
				if(pairs.get(j).from == 1){
					sub += pairs.get(j).end;
					long del =	queue.poll();
					sub -= del;
					syurui++;
					index = j+1;
					break;
				}
			}
//			System.out.println("sub "+sub);
			maxans[syurui] = sub;
		}
		
		for(int i = 0;i <= k;i++){
			ans = Math.max(ans, maxans[i] + i*i);
		}

		System.out.println(ans);








	}


}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

