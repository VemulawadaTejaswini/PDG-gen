import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int a[]=new int[N/2];
		int b[]=new int[N/2];
		int c[]=new int[N/2];
		int d[]=new int[N/2];
		int z=0,max1=0,max2=0,y=0,x=0,n=1,m=1;
		while(z<N/2){
			a[z]=stdIn.nextInt();
			b[z]=stdIn.nextInt();
			z++;
		}z=1;
		Arrays.sort(a);
		Arrays.sort(b);
		while(z<N/2){
			if(a[z-1]!=a[z]){
				if(max1<n)
					max1=a[z-1];
				c[y]=n;y++;
				n=0;
			}
			if(b[z-1]!=b[z]){
				if(max2<m)
					max2=b[z-1];
				d[x]=m;x++;
				m=0;
			}
			m++;n++;z++;
		}
		if(max1<n)
			max1=a[z-1];
		c[y]=n;y++;
		if(max2<m)
			max2=b[z-1];
		d[x]=m;x++;
		Arrays.sort(c);
		Arrays.sort(d);
		if(max1==max2){
			if(N==2)
				System.out.println(1);
			else{
				n=c[N/2-1]+d[N/2-2];
				m=c[N/2-2]+d[N/2-1];
				if(n<=m)
					System.out.println(N-m);
				else
					System.out.println(N-n);
			}
		}
		else
			System.out.println((N/2-c[N/2-1])+(N/2-d[N/2-1]));
	}
}