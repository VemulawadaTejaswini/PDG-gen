import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();

		while(m-- > 0){
			int n=sc.nextInt(), k=sc.nextInt();
			int[] x = new int[n];
			PriorityQueue<MyInteger> pq = new PriorityQueue<MyInteger>();

			for(int i=0;i<n;i++){
				x[i] = sc.nextInt();
			}

			if(n == 0 || n == 1 || k >= n){
				System.out.println(0);
				continue;
			}

			Arrays.sort(x);
			int d = x[n-1] - x[0];
			for(int i=1;i<n;i++){
				pq.add(new MyInteger(x[i] - x[i-1]));
			}

			k--;
			while(k-- > 0){
				d -= pq.poll().value;
			}
			System.out.println(d);
		}
	}
}

class MyInteger implements Comparable<MyInteger>{
	int value;

	MyInteger(int value){
		this.value = value;
	}

	public int compareTo(MyInteger x){
		return x.value - this.value;
	}
}