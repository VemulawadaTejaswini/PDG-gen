import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		char S[][]=new char[H][W];
		int key[][]=new int[H][W];
		String a="";
		int z=0,y=0,x=0,max=0;
		while(z<H){
			a=stdIn.next();
			while(y<W){
				S[z][y]=a.charAt(y);
				if(S[z][y]=='#')
					x=-1;
				x++;
				key[z][y]=x;
				y++;
			}y=0;x=0;
			z++;
		}z=0;y=W-1;
		while(z<H){
			while(y>=0){
				if(S[z][y]=='#')
					x=-1;
				x++;
				key[z][y]+=x-1;
				y--;
			}y=W-1;x=0;
			z++;
		}z=0;y=0;
		while(z<W){
			while(y<H){
				if(S[y][z]=='#')
					x=-1;
				x++;
				key[y][z]+=x;
				y++;
			}y=0;x=0;
			z++;
		}z=0;y=H-1;
		while(z<W){
			while(y>=0){
				if(S[y][z]=='#')
					x=-1;
				x++;
				key[y][z]+=x-1;
				if(max<key[y][z])
					max=key[y][z];
				y--;
			}y=H-1;x=0;
			z++;
		}z=0;
		System.out.println(max-1);
	}
}