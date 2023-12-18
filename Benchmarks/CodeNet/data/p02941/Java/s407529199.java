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
			int count=0;
			int j;
			for(j=0;j<i;j++) {
				if(b[c.get(j)]<b[i]) {

					break;
				}else {
					count++;
				}
			}
			c.add(j, i);

		}
		System.out.println(c);
		int C=0;
		while(c.size()!=0) {
			Integer i=c.get(0);
			if(i==0) {
				b[i]=b[i]-b[N-1]-b[1];
			}else if(i==N-1) {
				b[i]=b[i]-b[i-1]-b[0];
			}else {
				b[i]=b[i]-b[i+1]-b[i-1];
			}
			if(b[i]<a[i]) {
				System.out.println(-1);
				return;
			}
			c.remove(i);
			//System.out.println(a[i]+" "+b[i]);
			if(b[i]!=a[i]) {
				//System.out.println(a[i]+" "+b[i]);

				int count=0;
				for(Integer j:c) {
					//System.out.println(b[j]+","+b[i]);

					if(b[j]<b[i]) {
						//System.out.println(count);
						c.add(count,i);

						break;
					}

					count++;

				}
				if(count==c.size()) {
					c.add(count,i);
				}
			}
			C++;
			/*System.out.println(c);
			for(int x=0;x<N;x++) {
				System.out.print(b[x]+" ");
			}
			System.out.println();
			for(int x=0;x<N;x++) {
				System.out.print(a[x]+" ");
			}
			System.out.println();*/
		}
		System.out.println(C);
	}
}
