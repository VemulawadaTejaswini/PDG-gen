import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int d=sc.nextInt();		

		long[] a=new long[x];
		long[] b=new long[y];
		long[] c=new long[z];
		for(int i=0;i<x;i++){
			a[i]=sc.nextLong();
		}
		for(int i=0;i<y;i++){
			b[i]=sc.nextLong();
		}
		for(int i=0;i<z;i++){
			c[i]=sc.nextLong();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		PriorityQueue<Long> r=new PriorityQueue<>();
		r.add(-1L);

		for(int i=x-1;i>=0;--i){
			if(r.peek()>a[i]+b[y-1]+c[z-1])
				break;
			for(int j=y-1;j>=0;--j){
				if(r.peek()>a[i]+b[j]+c[z-1])
					break;
					for(int k=z-1;k>=0;--k){
						if(r.peek()>a[i]+b[j]+c[k])
							break;

						r.add(a[i]+b[j]+c[k]);
						if(r.size()>d)
							r.poll();
					}
				}
			}
		}
		r.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
}