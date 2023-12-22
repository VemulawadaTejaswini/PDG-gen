import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int[] R;
	int i,j;
	int max;
	
	public void input() {
		n = sc.nextInt();
		R = new int[n];
		for(int i=0; i<n; i++) {
			R[i] = sc.nextInt();
		}
	}
	
	public void conpute() {
		max = R[1] - R[0];
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				compare(R[j], R[i]);
			}
		}
		System.out.println(max);
	}
	
	public void compare(int a,int b) {
		if(a-b >= max) { max = a-b; }
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.conpute();
	}
}

