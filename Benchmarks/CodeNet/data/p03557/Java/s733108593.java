import java.util.*;
public class Main{
	static int Dan1(int[] d, int key){
		int pl = 0;
		int pr = d.length - 1;
		int pc = (pl + pr) / 2;
		while(pl<pr){
			if(d[pc]<key)pl = pc + 1;
			else {
				pr = pc;
			}
			pc = (pl + pr) / 2;
		}
		if(d[pl]==key)return pl;
		if(d[pc]>key)return pc;
		else return pc + 1;
	}

	static int Dan2(int[] d, int key){
		int pl = 0;
		int pr = d.length - 1;
		int pc = 0;
			pc = (pl + pr + 1) / 2;
		while(pl<pr){
			if(d[pc]>key)pr = pc - 1;
			else {
				pl = pc;
			}
			pc = (pl + pr + 1) / 2;
		}
		if(d[pr]==key)return d.length - 1 - pr;
		if(d[pc]>key)return d.length - pc;
		else return d.length - pc -1;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(sc.next());
		}
		for(int i=0; i<n; i++){
			b[i] = Integer.parseInt(sc.next());
		}
		for(int i=0; i<n; i++){
			c[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(a);
		Arrays.sort(c);
		int num = 0;
		for(int i=0; i<n; i++){
			num += Dan1(a, b[i]) * Dan2(c, b[i]);
		}
		System.out.println(num);
	}
}