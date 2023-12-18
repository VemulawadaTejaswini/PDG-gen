import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		String baka[]=new String[H];
		char A[][]=new char[H][W];
		int Z[]=new int[H*W];
		int Y[]=new int[H*W];
		int z=0,y=0,x=0,i=0,z2=0,y2=0,x2=0,minx=100000,max=0;
		while(z<H){
			baka[z]=stdIn.next();
			z++;
		}z=0;
		while(z<H){
			while(y<W){
				A[z][y]=baka[z].charAt(y);
				if(A[z][y]=='#'){
					Z[x]=z;
					Y[x]=y;
					x++;
				}
				y++;
			}
			y=0;z++;
		}z=0;
		while(z<H){
			while(y<W){
				if(A[z][y]=='.'){
					while(i<x){
						z2=Z[i]-z;
						y2=Y[i]-y;
						if(z2<0)
							z2*=-1;
						if(y2<0)
							y2*=-1;
						x2=z2+y2;
						if(x2<minx){
							minx=x2;
						}
						if(minx<max)
							break;
						i++;
					}i=0;
					if(minx>max)
						max=minx;
					minx=100000;
				}
				y++;
			}
			y=0;z++;
		}
		System.out.println(max);
	}
}