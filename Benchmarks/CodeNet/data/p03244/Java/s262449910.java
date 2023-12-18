import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] v1 = new int[100001];
		int[] v2 = new int[100001];
		int[] v11 = new int[2];
		int[] v12 = new int[2];
		int[] v21 = new int[2];
		int[] v22 = new int[2];
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0 || i == 0) {
				int a = sc.nextInt();
				v1[a]++;

			} else {
				int b = sc.nextInt();
				v2[b]++;
			}
		}
		
		v11 = saidai(v1);
		v1[v11[0]] = 0;
		v12 = saidai(v1);
		
		v21 = saidai(v2);
		v2[v21[0]] = 0;
		v22 = saidai(v2);
		
		if(v11[0] == v21[0]) {
			if(v11[1] + v22[1] >= v12[1] + v21[1]) {
				System.out.println(n - v11[1] - v22[1]);
			} else {
				System.out.println(n - v12[1] - v21[1]);
			} 
		} else {
			System.out.println(n - v11[1] - v21[1]);
		}
	}
	
	public static int[] saidai(int[] x) {
		int m = 0;
		int[] ret = new int[2];
		for(int i = 0; i < x.length; i++) {
			if(m < x[i]) {
				ret[0] = i;
				ret[1] = x[i];
			}
		}
		return ret;
	}
}
