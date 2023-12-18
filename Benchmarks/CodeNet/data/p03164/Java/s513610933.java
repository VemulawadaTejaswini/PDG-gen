import java.util.*;
import java.io.*;




public class Main
{
	static class node
	{
		int weight,indx;
		node(int w,int i)
		{
			weight=w;indx=i;
		}
		public int hashCode()
		{
			// System.out.println("In hashcode");
			int hashcode = 0;
			hashcode = weight*20;
			hashcode += indx;
			return hashcode;
		}
		public boolean equals(Object obj)
		{
	        // System.out.println("In equals");
	        if (obj instanceof node) {
	            node pp = (node) obj;
	            return ((pp.weight==this.weight) && (pp.indx == this.indx));
	        } else {
	            return false;
	        }
    	}
	}
	
	static HashMap<node,String> mp = new HashMap<node,String>();
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	

	static int n;
	static int[] val,wght;

	static int find(int weight,int indx)
	{
		if(weight<=0 || indx>=n)
			return 0;
		if(mp.containsKey(new node(weight,indx)))
			return Integer.parseInt(mp.get(new node(weight,indx)));
		if(wght[indx]<=weight)
		{
			mp.put(new node(weight,indx),Integer.toString(Math.max(val[indx]+find(weight-wght[indx],indx+1),find(weight,indx+1))));
			return  Integer.parseInt(mp.get(new node(weight,indx)));
		}
		mp.put(new node(weight,indx),Integer.toString(find(weight,indx+1)));
		return Integer.parseInt(mp.get(new node(weight,indx)));

	}
	

		
	public static void main(String[] args)throws IOException{
		

			int t=1;
			while(t-->0)
			{
				String[] s=br.readLine().split(" ");
				n=Integer.parseInt(s[0]);
				int w=Integer.parseInt(s[1]);
				val=new int[n];
				wght=new int[n];

				for(int i=0;i<n;i++)
				{
					s=br.readLine().split(" ");
					wght[i]=Integer.parseInt(s[0]);
					val[i]=Integer.parseInt(s[1]);
				}


				System.out.println(find(w,0));


			}








	}
	
}
