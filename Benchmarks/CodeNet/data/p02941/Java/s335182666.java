import java.util.ArrayList;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long a[]=new long[N];
		long b[]=new long[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextLong();
		}
		//int c[]=new int[N];
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			b[i]=sc.nextLong();
			if(b[i]!=a[i]) {
				c.add(i);
			}
		}
		//System.out.println(c);
		long C=0;
		//int can=0;
		int last=0;
		while(c.size()!=0) {
			Integer i=c.get(0);
			if(i==0) {
				if(b[i]>b[N-1]+b[1]) {
					while(b[i]>b[N-1]+b[1]) {
						C++;
						b[i]=b[i]-b[N-1]-b[1];
						last=i;
					}
				}else if(last==i){
					System.out.println(-1);
					return;
				}
			}else if(i==N-1) {
				if(b[i]>b[i-1]+b[0]) {
					while(b[i]>b[i-1]+b[0]) {
						C++;
						b[i]=b[i]-b[i-1]-b[0];
						last=i;
					}
				}else if(last==i){
					System.out.println(-1);
					return;
				}
			}else {
				if(b[i]>b[i+1]+b[i-1] ) {
					while(b[i]>b[i+1]+b[i-1]) {
						C++;
						b[i]=b[i]-b[i+1]-b[i-1];
						last=i;
					}
				}else if(last==i){
					System.out.println(-1);
					return;
				}
			}

			c.remove(i);
			//System.out.println(a[i]+" "+b[i]);
			if(b[i]!=a[i]) {
				//System.out.println(a[i]+" "+b[i]);

					//System.out.println(b[j]+","+b[i]);
				c.add(i);
			}

			if(b[i]<a[i]) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(C);
	}
}
