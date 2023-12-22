import java.util.*;
public class Main{
	private static int h, w, cnt;
	private int[] ColumnCheck(char c[]){
		int a[] = new int[w];
		for(int i = 0;i < w;i++){
			if(c[i] == 'c') cnt = 0;
			else if(cnt >= 0) cnt++;
			a[i] = cnt;
		}
		return a;
	}
	private void print(int a[][]){
		for(int i = 0;i < h;i++){
			for(int k = 0;k < w;k++){
				if(k != w - 1) System.out.print(a[i][k] + " ");
				else System.out.println(a[i][k]);
			}
		}
	}
	private void doIt(){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		int a[][] = new int[h][w];
		char c[][] = new char[h][w];
		for(int i = 0;i < h;i++){
			cnt = -1;
			c[i] = sc.next().toCharArray();
			a[i] = ColumnCheck(c[i]);
		}
		print(a);
	}
	public static void main(String args[]){
		new Main().doIt();
	}
}