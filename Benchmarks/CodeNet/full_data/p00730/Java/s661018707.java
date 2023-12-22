
import java.util.Arrays;
import java.util.Scanner;

class CAKE implements Comparable<CAKE>{
	int w,d,surface,ar,number;
	CAKE(int w,int d){
		this.w=w;
		this.d=d;
		this.surface=(w*d);
		this.ar=(w+d);
	}

	@Override
	public int compareTo(CAKE c1) {
		if (this.surface < c1.surface) {
			return -1;
		} else if (this.surface > c1.surface) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class Main {
	static int p,s,k;
	static CAKE c[];

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,w,d,i;

		while(true){
			k=0;
			n=sc.nextInt();
			w=sc.nextInt();
			d=sc.nextInt();
			if(n==0 && w==0 && d==0) break;
			c=new CAKE[n+1];
			c[k]=new CAKE(w,d);
			c[k].number=1;
			k++;
			for(i=0;i<n;i++){
				p=sc.nextInt();
				s=sc.nextInt();
				for(int j=0;j<k;j++){
					if(p<c[j].number){
						c[j].number++;
					}
				}
				cut_position();
			}
			Arrays.sort(c);
			boolean f=true;
			for(i=0;i<k;i++){
				if(f){
					System.out.print(c[i].surface);
				}
				else{
					System.out.print(" "+c[i].surface);
				}
				f=false;
			}
			System.out.println();
		}
	}//main

	static void cut_position(){
		int i,n=-1,temp;
		for(i=0;i<k;i++){
			if(c[i].number==p){
				n=i;
				break;
			}
		}
		temp=s%c[n].ar;
		if(c[n].w<temp){
			cut1(n,temp-c[n].w);
		}
		else{
			cut2(n,temp);
		}
	}

	static void cut1(int n,int posi){
		c[n].d-=posi;
		c[n].surface=(c[n].d*c[n].w);
		c[n].ar=(c[n].w+c[n].d);
		c[k]=new CAKE(c[n].w,posi);
		if(c[k].surface<c[n].surface){
			c[k].number=c[n].number;
			c[n].number++;
		}
		else{
			c[k].number=c[n].number+1;
		}
		k++;
	}
	static void cut2(int n,int posi){
		c[n].w-=posi;
		c[n].surface=(c[n].d*c[n].w);
		c[n].ar=(c[n].w+c[n].d);
		c[k]=new CAKE(posi,c[n].d);
		if(c[k].surface<c[n].surface){
			c[k].number=c[n].number;
			c[n].number++;
		}
		else{
			c[k].number=c[n].number+1;
		}
		k++;
	}
}