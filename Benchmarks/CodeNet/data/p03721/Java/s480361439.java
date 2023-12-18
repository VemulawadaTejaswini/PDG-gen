import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		long K = io.nextLong();
		PriorityQueue<Point> array = new PriorityQueue<Point>();
		for(int i=0;i<N;i++){
			Point n = new Point(io.nextInt(),io.nextInt());
			array.offer(n);
		}
		
		int ans=0;
		long sum=0;
		while(sum<K){
			Point now = array.poll();
			ans = now.a;
			sum += now.b;
//			System.out.println(ans+" "+sum+" "+array.size());
		}
		
		System.out.println(ans);
	}
}

class Point implements Comparable<Point>{
	int a,b;
	public Point(int a,int b){
		this.a = a;
		this.b = b;
	}
	@Override
	public int compareTo(Point o) {
		return Integer.compare(a,o.a);
		
	}
}