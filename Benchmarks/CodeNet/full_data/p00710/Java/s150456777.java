import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//枚数
		int r = sc.nextInt();//回数
		int[] huda = new int[n];
		for(int i=0;i<n;i++) huda[i] = i+1;

		for(int i=0;i<r;i++){
			int p = sc.nextInt();//上から何枚
			int c = sc.nextInt();//ここまで
			int[] temp = new int[p];
			for(int i=0;i<p;i++) temp[i] = huda[i];
			for(int i=0;i<c;i++) huda[i] = huda[i+p-1];
			for(int i=0;i<p;i++) huda[c+i] = temp[i];
		}
		System.out.println(huda[0]);
	}
}
