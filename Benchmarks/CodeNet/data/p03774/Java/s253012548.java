import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[m];
		int[] d = new int[m];
		int data = 99999999;
		int check = 0;
		int min = 99999999;
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for(int i = 0;i < m;i++){
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		
		for(int i = 0;i < n;i++){
			for(int j = 0;j < m;j++){
				data = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
				if(data < min) {
					min = data;
					check = j;
				}
			}
			System.out.println(check+1);
			min = 99999999;
			check = 0;
		}
		
	}
}