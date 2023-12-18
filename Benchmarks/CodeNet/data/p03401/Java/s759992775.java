import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int suma[]=new int[N+1];
		int sumz[]=new int[N+1];
		int z=0,y=0,x=0,v=0;int i=0;int j=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			z++;
		}z=0;
		while(z<N-1){
			y=A[z]-A[z+1];
			x=A[N-1-z]-A[N-2-z];
			if(y<0)
				y*=-1;
			if(x<0)
				x*=-1;
			i+=y;j+=x;
			suma[z+2]=i;
			sumz[N-2-z]=j;
			z++;
		}z=0;
		while(z<N){
			if(z!=0&&z!=N-1){
				v=A[z-1]-A[z+1];
				if(v<0)
					v*=-1;
			}
			int go=A[0];int back=A[N-1];
			if(z==0)
				go=A[1];
			if(z==N-1)
				back=A[N-2];
			if(go<0)
				go*=-1;
			if(back<0)
				back*=-1;
			System.out.println(suma[z+2-2]+v+sumz[z+1]+go+back);
			z++;v=0;
		}
	}
}