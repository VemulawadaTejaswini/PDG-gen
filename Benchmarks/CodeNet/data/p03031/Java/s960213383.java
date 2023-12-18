import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int k[][]=new int[M][N];
		int p[]=new int[M];
		int med[]=new int[N];
		String a="";
		int z=0,y=0,x=0,sum=0,ans=0;
		int fin=0;
		while(z<M){
			y=stdIn.nextInt();
			while(x<y){
				k[z][x]=stdIn.nextInt();
				x++;
			}x=0;
			z++;
		}z=0;y=0;
		while(z<M){
			p[z]=stdIn.nextInt();
			z++;
		}z=0;
		while(z<Math.pow(2,N)){
			a=Integer.toBinaryString(z);
			while(y<N){
				if(y>=a.length())
					med[y]=0;
				else
					if(a.charAt(a.length()-y-1)=='1')
						med[y]=1;
				y++;
			}y=0;
			while(y<M){
				while(x<N){
					if(k[y][x]==0)
						break;
					if(med[k[y][x]-1]==1)
						sum++;
					x++;
				}
				if(sum%2==p[y])
					fin++;
				if(fin!=y+1)
					break;
				y++;x=0;sum=0;
			}y=0;
			if(fin==M){
				ans++;
			}
			while(y<N){
				med[y]=0;
				y++;
			}y=0;
			z++;x=0;sum=0;fin=0;
		}
		System.out.println(ans);
	}
}