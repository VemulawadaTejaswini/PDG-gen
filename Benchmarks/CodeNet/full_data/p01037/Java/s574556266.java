import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new A().doIt();
	}
	
	class A{
		void doIt(){
			int n = in.nextInt();
			int m = in.nextInt();
			int[] hyou = new int[n];
			for(int i=0;i<m;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				for(int s=a;s<a+b;s++){
					int index = s % n;
					hyou[index] = 1;
				}
			}
//			System.out.println(Arrays.toString(hyou));
			int[] result = new int[101];
			int sum = 0;
			boolean sw = false;
			int memo = 0;
			for(int i=0;i<n;i++){
				if(hyou[i]>0)sum++;
				else {
					if(!sw){
						sw = true;
						memo = sum;
					}else result[sum]++;
					sum = 0;
				}
			}
			if(sum > 0){
				result[sum + memo]++;
			}else{
				result[memo]++;
			}
			
			for(int i=100;i>=1;i--)if(result[i]>0){
				System.out.println(i+" "+result[i]);
			}
		}
	}
	
	
	class C{
		int[][] hyou;
		void doIt(){
			int n = in.nextInt();
			int x = in.nextInt();
			hyou = new int[n][2];
			for(int i=0;i<n;i++){
				hyou[i][0] = in.nextInt();
				hyou[i][1] = in.nextInt();
			}
			PriorityQueue<Data> q = new PriorityQueue<Main.C.Data>();
			q.add(new Data(0, 0));
			
			boolean[] closed = new boolean[1500010];
			while(q.size()>0){
				Data d = q.remove();
				if(d.v == x){
					System.out.println(d.cost);
					return;
				}
				for(int i=0;i<n;i++){
					int nv = hyou[i][0] + d.v;
					if(!closed[nv])q.add(new Data(nv, d.cost + hyou[i][1]));
					nv = d.v - hyou[i][0];
					if(nv >= 0 && !closed[nv])q.add(new Data(nv, d.cost + hyou[i][1]));
				}
			}
			System.out.println("-1");
		}
		
		class Data implements Comparable<Data>{
			int v,cost;
			public Data(int v,int cost) {
				this.v = v;
				this.cost = cost;
			}
			public int compareTo(Data o) {
				return this.cost - o.cost;
			}
		}
		
	}
}
