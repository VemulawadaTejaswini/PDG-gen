import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	
	int n;
	int[] A;
	int m,cnt;
	int h;
	public ArrayList<Integer> G  = new ArrayList<Integer>();
	
	public void input() {
		n = sc.nextInt();
		A = new int[n];
		for(int i=0; i<n; i++) {A[i] = sc.nextInt();}
	}
	
	public void shellSort() {
		for(h =1; h < n; h=h*3+1) {
			m++;
			G.add(h);
		}
		for(; h>0; h /= 3) {
			for(int i=h; i<n; i++) {
				int j = i;
				while(j >= h && A[j-h] > A[j]) {
					int temp = A[j];
					A[j] = A[j-h];
					A[j-h] = temp;
					j -= h;
					cnt++;
				}
			}
		}
	}
	
	public void output() {
		System.out.println(m);
		for(int i=G.size()-1; i>=0; i--) {
			if(i == 0) System.out.println( G.get(i) );
			else System.out.print(G.get(i)+" ");
		}
		System.out.println(cnt);
		for(int i=0; i<n; i++) System.out.println(A[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.shellSort();
		obj.output();
	}
	
	
}

