import java.util.*;
public class Main {
	public static void main(String[] args) {
		D();
	}
	
	public static void D() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		ArrayList<ArrayList<Integer>> lis = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<C;i++) {
			lis.add(new ArrayList<Integer>());
		}
		for(int i=0;i<N;i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int c = sc.nextInt()-1;
			//if(c>C) System.out.println("N");
			lis.get(c).add(s);
			lis.get(c).add(t);
		}
		int[] sum = new int[20020];
		for(int i=0;i<C;i++) {
			updatesum(sum,lis.get(i));
		}
		int max = 0;
		for(int i=0;i<sum.length;i++) {
			if(max < sum[i]) max = sum[i];
		}
		System.out.println(max);
		
	}
	//チャネルのsitiのlistを受け取り、sumの配列を更新する
	public static void updatesum(int[] sum, List<Integer> sche) {
		int[] temp = new int[sum.length];
		for(int i=0;i<sche.size();i+=2) {
			int st = sche.get(i)*2-1;
			int ed = sche.get(i+1)*2;
			temp[st] = 1;
			temp[ed] = -1;
		}
		int tempsum = 0;
		for(int i=0;i<sum.length;i++) {
			tempsum += temp[i];
			sum[i] += tempsum;
		}
	}
}
