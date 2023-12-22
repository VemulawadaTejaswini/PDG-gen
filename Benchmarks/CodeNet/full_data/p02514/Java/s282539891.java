import java.util.PriorityQueue;
import java.util.Scanner;

//D:Dark Programmer
public class Main{

	public static class T implements Comparable<T>{
		public int y;
		public int m;
		public int d;
		public T(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;
		}
		public int compareTo(T o) {
			return y!=o.y?y-o.y:m!=o.m?m-o.m:d-o.d;
		}
		public String toString() {
			String sy = y+"";
			while(sy.length()!=4)sy = "0"+sy;
			String sm = m+"";
			while(sm.length()!=2)sm = "0"+sm;
			String sd = d+"";
			while(sd.length()!=2)sd = "0"+sd;
			return sy+" "+sm+" "+sd;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			PriorityQueue<T> q = new PriorityQueue<T>();
			while(n--!=0)q.add(new T(sc.nextInt(),sc.nextInt(),sc.nextInt()));
			while(!q.isEmpty())System.out.println(q.poll());
		}
	}
}