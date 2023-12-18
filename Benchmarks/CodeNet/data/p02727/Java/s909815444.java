import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		long x = inputs.nextInt();
		long y = inputs.nextInt();
		int red = inputs.nextInt();
		int[] r = new int[red];
		int green = inputs.nextInt();
		int[] g = new int[green];
		int clear = inputs.nextInt();
		int[] c = new int[clear];
		for(int i=0;i<red;i++) {
			r[i] = inputs.nextInt();
		}
		Arrays.sort(r);
		for(int i=0;i<green;i++) {
			g[i] = inputs.nextInt();
		}
		Arrays.sort(g);
		for(int i=0;i<clear;i++) {
			c[i] = inputs.nextInt();
		}
		Arrays.sort(c);
		PriorityQueue<Integer> app = new PriorityQueue<Integer>();
		long sum =0;
		for(int i=(int)(red-x);i<red;i++) {
			sum+=r[i];
			app.add(r[i]);
		}
		for(int i=(int) (green-y);i<green;i++) {
			sum+=g[i];
			app.add(g[i]);
		}
		int track = (int) (clear-1);
		while(track>=0) {
			long num = app.peek();
			if(c[track]>num) {
				sum-=num;
				app.remove();
				sum+=c[track];
			}
			track--;
		}
		System.out.println(sum);
	}

}
