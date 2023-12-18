import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int[][] boob=new int[H+2][W+2];
		int[][] suji=new int[H][W];

		for(int i=0; i<=H+1; i++) {
			for(int j=0; j<=W+1; j++) {
				boob[i][j]=0;
			}
		}
		String a="";
		for(int i=1; i<=H; i++) {
			a=sc.next();
			for(int j=1; j<=W; j++) {
				if(a.charAt(j-1)=='.') {
					boob[i][j]=0;
				}

				else if(a.charAt(j-1)=='#') {
					boob[i][j]=1;
				}
			}
		}

		int counter=0;
		for(int i=1; i<=H; i++) {
			for(int j=1; j<=W; j++) {
				counter=0;
				if(boob[i][j]==0) {
					for(int k=-1; k<=1; k++) {
						for(int l=-1; l<=1; l++) {
							suji[i-1][j-1]+=boob[i+k][j+l];
						}
					}
				}
				else {
					suji[i-1][j-1]=10;
				}
			}
		}
		String b="";
		for(int i=0; i<H; i++) {
			b="";
			for(int j=0; j<W; j++) {
				if(suji[i][j]<10) {
					b=b+""+suji[i][j];
				}
				else {
					b=b+"#";
				}
			}
			System.out.println(b);
		}
	}
}