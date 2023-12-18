import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int P[]=new int[M];
		int Y[]=new int[M];
		int a[][]=new int[M+1][M+1];
		int b[]=new int[M];
		int X[]=new int[M];
		String s="";
		String t="";
		int pmax=0,len=0,len2=0;
		int z=0,y=0,x=0,w=0;
		while(z<M) {
			P[z]=stdIn.nextInt();
			Y[z]=stdIn.nextInt();
			b[z]=1000000001;
			if(pmax<P[z])
				pmax=P[z];
			while(true) {
				if(a[P[z]][y]==0) {
					a[P[z]][y]=Y[z];
					break;
				}
				y++;
			}
			y=0;
			z++;
		}z=0;y=0;
		while(x<=pmax) {
			if(a[x][0]!=0) {
				while(true) {
					if(a[x][z]==0)
						break;
					b[z]=a[x][z];
					z++;
				}
				Arrays.sort(b);
				while(y<z) {
					a[x][y]=b[y];
					y++;
				}y=0;z=0;
				X[w]=x;
				w++;
			}
			x++;
		}y=0;z=0;x=0;
		while(y<w) {
			s=String.valueOf(X[y]);
			len=s.length();
			while(true) {
				if(a[X[y]][z]==0)
					break;
				t=String.valueOf(z+1);
				len2=t.length();
				while(x<6-len) {
					System.out.print(0);
					x++;
				}x=0;
				System.out.print(s);
				while(x<6-len2) {
					System.out.print(0);
					x++;
				}x=0;
				System.out.print(t);
				System.out.println();
				z++;
			}z=0;
			y++;
		}
	}
}