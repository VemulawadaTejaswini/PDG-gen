import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int cap=scn.nextInt();
		long[] c=new long[n];
		long[] v=new long[n];
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			long a=scn.nextLong();
			long b=scn.nextLong();
			c[i]=a;
			v[i]=b;
			
			
		}
		System.out.println(kp(c,v,cap,0));
				

	}
	public static long kp(long[] c,long[] v,long cap,int vidx) {
		if(vidx==c.length) {
			return 0; 
		}
		
		  long capacity=c[vidx];
		  long kp3=0;
		  if(capacity<=cap) {
			  long kp1=v[vidx]+kp(c,v,cap-capacity,vidx+1);
			 
			  long kp2=kp(c,v,cap,vidx+1);
			  String str1=String.valueOf(kp1);
			  String str2=String.valueOf(kp2);
			  kp3=Math.max(Long.valueOf(str1),Long.valueOf(str2));
			 
			  
			  
		  }else {
			   kp3=kp(c,v,cap,vidx+1);
			  
		  }
		  return kp3;
		
		
	}

}
