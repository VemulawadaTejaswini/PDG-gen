import java.util.ArrayList;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		int b[]=new int[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		//int c[]=new int[N];
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			b[i]=sc.nextInt();
			if(b[i]!=a[i]) {
				c.add(i);
			}
		}
		//System.out.println(c);
		int C=0;
		//int can=0;
		int max=-1;
		while(c.size()!=0) {
			Integer i=c.get(0);
			if(i==0) {
				if(b[i]>b[N-1]+b[1]) {
					while(b[i]>b[N-1]+b[1]) {
						C++;
						b[i]=b[i]-b[N-1]-b[1];
						max=-1;
					}
				}else if(max==-1){
					max=i;
				}else if(max!=-1){
					if(i==max) {
						System.out.println(-1);
						return;
					}
					if(b[i]>b[max])max=i;
				}
			}else if(i==N-1) {
				if(b[i]>b[i-1]+b[0]) {
					while(b[i]>b[i-1]+b[0]) {
						C++;
						b[i]=b[i]-b[i-1]-b[0];
						max=-1;
					}
				}else if(max==-1){
					max=i;
				}else if(max!=-1){
					if(i==max) {
						System.out.println(-1);
						return;
					}
					if(b[i]>b[max])max=i;
				}
			}else {
				if(b[i]>b[i+1]+b[i-1] ) {
					while(b[i]>b[i+1]+b[i-1]) {
						C++;
						b[i]=b[i]-b[i+1]-b[i-1];
						max=-1;
					}
				}else if(max==-1){
					max=i;
				}else if(max!=-1){
					if(i==max) {
						System.out.println(-1);
						return;
					}
					if(b[i]>b[max])max=i;
				}
			}

			c.remove(i);
			//System.out.println(a[i]+" "+b[i]);
			if(b[i]!=a[i]) {
				//System.out.println(a[i]+" "+b[i]);

					//System.out.println(b[j]+","+b[i]);
				c.add(i);
			}
			/*for(int x=0;x<N;x++) {
				System.out.print(b[x]+" ");
			}
			System.out.println();
			for(int x=0;x<N;x++) {
				System.out.print(a[x]+" ");
			}
			System.out.println();
			System.out.println("C="+c);*/
			if(b[i]<a[i]) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(C);
	}
}
