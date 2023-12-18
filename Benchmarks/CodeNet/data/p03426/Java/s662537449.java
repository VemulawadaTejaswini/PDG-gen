import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		int D=stdIn.nextInt();
		String A[]=new String[(H*W)+1];
		int z=0,y=0;
		while(z<H){
			while(y<W){
				int a=stdIn.nextInt();
				A[a]=z+","+y;
				y++;
			}y=0;
			z++;
		}z=0;
		int Q=stdIn.nextInt();
		int map[][]=new int[H*W][H*W];
		int ans[]=new int[Q];
		while(z<Q){
			int L=stdIn.nextInt();
			int R=stdIn.nextInt();
			int l=L;
			if(map[L][R]!=0){
				y=map[L][R];
			}
			else
				while(true){
					if(L==R){
						map[l][R]=y;
						break;
					}
					int c=A[L].indexOf(',');
					int X=Integer.valueOf(A[L].substring(0,c));
					int Y=Integer.valueOf(A[L].substring(c+1,A[L].length()));
					c=A[L+D].indexOf(',');
					X-=Integer.valueOf(A[L+D].substring(0,c));
					Y-=Integer.valueOf(A[L+D].substring(c+1,A[L+D].length()));
					if(X<0)
						X*=-1;
					if(Y<0)
						Y*=-1;
					y+=X+Y;
					L+=D;
				}
			ans[z]=y;
			y=0;
			z++;
		}z=0;
		while(z<Q){
			System.out.println(ans[z]);
			z++;
		}
	}
}