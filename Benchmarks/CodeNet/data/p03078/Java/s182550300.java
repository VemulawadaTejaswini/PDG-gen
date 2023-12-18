import java.util.*;
import java.util.Vector;
import java.math.*; 
public class Main {
     Scanner sc = new Scanner(System.in);
	
	
	void run(){ // kokonikaku
	 int  x=sc.nextInt();
	 int  y=sc.nextInt();
	 int  z=sc.nextInt();
	 int  k=sc.nextInt();
	 
	long[] a =new long[1010];
	long[] b =new long[1010];
	long[] c =new long[1010];
		
		for(int i=0;i<x;i++){
			a[i]=sc.nextLong();
			a[i]*=-1;
		}
		Arrays.sort(a,0,x);
		for(int i=0;i<x;i++){
			a[i]*=-1;
			
		//	System.out.println(a[i]);
		}
		
		for(int i=0;i<y;i++){
			b[i]=sc.nextLong();
			b[i]*=-1;
		}
		Arrays.sort(b,0,y);
		for(int i=0;i<y;i++){
			b[i]*=-1;
			
		//	System.out.println(a[i]);
		}
		
		for(int i=0;i<z;i++){
			c[i]=sc.nextLong();
			c[i]*=-1;
		}
		Arrays.sort(c,0,z);
		for(int i=0;i<z;i++){
			c[i]*=-1;
			
			//System.out.println(a[i]);
		}
		
		ArrayList<Long> ve=new ArrayList<Long>();
		for(int i=0;i<x;i++)for(int j=0;j<y;j++){
			ve.add(a[i]+b[j]);
		}
		Collections.sort(ve, Comparator.reverseOrder());
    //	System.out.println(ve.toString());
		
		//ArrayList<Long> ve2=new ArrayList<Long>();
		
		int siz=Math.min(k,x*y);
		
		ArrayList<Long> ve3=new ArrayList<Long>();
		
		for(int i=0;i<siz;i++)for(int j=0;j<z;j++){
			ve3.add(ve.get(i)+c[j]);
		}
		
		Collections.sort(ve3, Comparator.reverseOrder());
		
		for(int i=0;i<k;i++){
			System.out.println(ve3.get(i));
		}
		
		/*
		for(int i=0;i<x*y;i++){
			System.out.println(ve[i]);
		}
		*/
	}

	
	public static void main(String[] args) {
		new Main().run();
        
    }
}