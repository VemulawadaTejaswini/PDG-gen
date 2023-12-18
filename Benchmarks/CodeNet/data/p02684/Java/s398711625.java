import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int i,j;
		int[][] d = new int[a][b+1];
		int[] e = new int[b];
		int f=1;
		int[] g = new int[b+1];
		int h=0;
		int aa=0,ab=0;
		for(i=0;i<a;i++) {
			for(j=0;j<b+1;j++) {
				d[i][j] = sc.nextInt();
			}
		}
		
		for(i=0;i<a;i++) {
			for(j=0;j<b;j++) {
			e[j]+=d[i][j+1];
			}
		}
		
		for(i=0;i<b;i++) {
			if(e[i] < c) f =0;
		}
		if(f==1) {
			for(int k=0;k<a;k++) {
				for(i=0;i<k;i++) {
					if(h==b) aa=1;
					h=0;
					for(j=0;j<b+1;j++) {
						g[j] += d[i][j];
						if(j!=0)if(g[j]>c-1) h++;
					}
				}
			}
		}
		*/
		int a=sc.nextInt();
		long b=sc.nextLong();
		int[] c = new int[a];
		int[] d = new int[a];
		int e;
		for(int i = 0; i<a;i++) {
			c[i] = sc.nextInt()-1;
		}
		e=0;
		int g=0;
		set.add(e);
		int f=0;
		int h=0;
		for(int i= 0;i<b;i++) {
			f++;
			e=c[e];
			
			if(set.contains(e)) {
				g=e;
				break;
			}
			set.add(e);
		}
		
		for(int i=0;i<b;i++) {
			h++;
			e=c[e];
			if(e==g) {
				break;
			}
		}
		int aa=f-h;
		b = b%aa;
		for(int i=0;i<b;i++) {
			e=c[e];
		}
		System.out.println(e+1);
		
		
		
		
		
		
		
		
		
	}	
}
