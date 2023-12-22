

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++){
			b[i] = in.nextInt();
		}
		int count = 0;
		for(int bb : b){
			for(int aa : a){
				if(bb == aa){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		in.close();
	}

}