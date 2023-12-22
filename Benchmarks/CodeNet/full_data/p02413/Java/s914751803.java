import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int[][] ary=new int[h+1][w+1];
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				ary[i][j]=sc.nextInt();
				ary[i][w]+=ary[i][j];
				ary[h][j]+=ary[i][j];
				ary[h][w]+=ary[i][j];
			}
		}
		for(int i=0; i<=h; i++) {
			output(ary[i]);
		}
	}
	public static void output(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
		if(a.length-1>=0) {
			System.out.println(a[a.length-1]);
		}
	}
}
