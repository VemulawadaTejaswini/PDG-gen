
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		Queue<Data> que = new PriorityQueue<Data>();
		
		for(int i = 0 ; i < n ;i++) {
			int p = Integer.parseInt(sc.next());
			que.add(new Data(p,1,p));
		}
		
		for(int i = 0 ; i < k ;i++) {
			Data d = que.poll();
			double r = (double)d.getP()/(d.getQ()+1);
			que.add(new Data(d.getP(),d.getQ()+1,r));
		}
		
		int ans = (int)Math.ceil(que.poll().getDiv());
		System.out.println(ans);
	
	}

}

class Data implements Comparable <Data>{
	
	private int p;
	private int q;
	private double div;
	
	public Data(int p , int q, double div) {
		this.p = p;
		this.q = q;
		this.div = div;
	}
	
	public int getP() {
		return p;
	}
	public int getQ() {
		return q;
	}
	public Double getDiv() {
		return div;
	}
	@Override
	public int compareTo(Data o) {
		if(div > o.getDiv()) {
			return -1;	
		}
		else if(div == o.getDiv()) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
