import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i=0; i<n; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		for(int i=0; i<n; i++) {
			if(p[i] != i+1) continue;
			if(i<n-1 && p[i+1]==i+2) {
				count++;
				swap(p, i, i+1);
				i++;
			} else if(i>0) {
				count++;
				swap(p, i-1, i);
			} else {
				count++;
				swap(p, i, i+1);
			}
		} 
		System.out.println(count);
	}
	
	static void swap(int[] p, int a, int b) {
		int tmp = p[a];
		p[a] = p[b];
		p[b] = tmp;
	}

}