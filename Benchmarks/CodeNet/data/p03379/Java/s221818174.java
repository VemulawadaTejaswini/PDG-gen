import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		int[] x2 = new int[n];

		for(int i=0;i<x.length;i++) {
			x[i] = sc.nextInt();
			x2[i] = x[i];
		}
		Arrays.sort(x2);

		for(int i=0;i<x.length;i++) {
			outMedian(x2, x[i]);
		}

	}

	private static void outMedian(int[] x,int i) {
		int[] tmp = new int[x.length-1];
		boolean hit = false;
		for(int j=0;j<x.length;j++) {
			if(x[j]==i && !hit) {
				hit = true;
			} else {
				if(!hit) {
					tmp[j]=x[j];
				} else {
					tmp[j-1]=x[j];
				}
			}
		}
		System.out.println(tmp[(tmp.length-1)/2]);
	}

}
