

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Main {

	public static void main(String[] args)throws Exception {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine().trim();
		int n=Integer.parseInt(s);

		String[] s1=br.readLine().split(" ");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(s1[i].trim());
		}
		
		
		int log=(int)Math.ceil(
				
				(float)((float)Math.log10(n))/((float)Math.log10(2))
				
				);

		int size=2*((int)Math.pow(2, log))-1;
		
		int[] segment=new int[size];

		construct_ST(a,segment,0,a.length-1,0);

		String s3=br.readLine().trim();
		int q=Integer.parseInt(s3);
//		System.out.println(get_sum(segment,0,n-1,0,a.length-1,0));
		while(q-->0) {
			
			String[] s4=br.readLine().split(" ");
			int l=Integer.parseInt(s4[0].trim());
			int r=Integer.parseInt(s4[1].trim());
			for(int i=0;i<n;i++) {
				if(a[i]==l) {
				int diff=r-a[i];
				a[i]=a[i]+diff;
				update(segment,0,a.length-1,i,0,diff);
				}
			}
			System.out.println(get_sum(segment,0,n-1,0,a.length-1,0));
			
			
		}
			
		
		
		
		
		
		
	}

	public static int construct_ST(int[] a,int[] seg,int l,int r,int i)
	{
		if(l>r)
		{
			return 0;
		}
		
		if(l==r)
		{
			seg[i]=a[l];
			return a[l]; 
		}
		int r1=0;
		int mid=l+(r-l)/2;
		r1+=construct_ST(a,seg,l,mid,(2*i+1));
		r1+=construct_ST(a,seg,mid+1,r,(2*i+2));
		seg[i]=r1;
		return r1;
		
	}
	
	
	
	public static int get_sum(int[] segment,int qs,int qe,int ss,int se,int i)
	{
		
		if(qs>se || qe<ss)
		{
			
			return  0;
		}
		
		
		if(ss>=qs && se<=qe)
		{
			return segment[i];
		}
		
		int mid=(ss+se)/2;
		int r1=0;
		
		
		r1+=get_sum(segment,qs,qe,ss,mid,2*i+1);
		r1+=get_sum(segment,qs,qe,mid+1,se,2*i+2);				
		return r1;
		
	}
	
	public static void update(int[] segment,int qs,int qe,int i,int i1,int diff)
	{
		if(i<qs || i>qe)
		{
			return;
		}
		segment[i1]=segment[i1]+diff;
		
		if(qe>qs)
		{
			int mid=(qs+qe)/2;	
			update(segment,qs,mid,i,(2*i1+1),diff);
			update(segment,mid+1,qe,i,(2*i1+2),diff);
		}
		
	}
}

