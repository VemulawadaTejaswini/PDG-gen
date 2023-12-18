import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int X = sc.nextInt();
	        int Y = sc.nextInt();
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        
	        long[] a = new long[A];
	        for (int i=0 ; i<A; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }
	        long[] b = new long[B];
	        for (int i=0 ; i<B; i++) {
	            b[i] = Long.parseLong(sc.next());
	        }
	        long[] c = new long[C];
	        for (int i=0 ; i<C; i++) {
	            c[i] = Long.parseLong(sc.next());
	        }
	        Arrays.sort(a);
	        Arrays.sort(b);
	        Arrays.sort(c);
	        
	        long[] d=new long[X+Y];
	        for(int i=0;i<X;i++) {
	        	d[i]=a[A-1-i];
	        }
	        for(int i=0;i<Y;i++) {
	        	d[X+i]=b[B-1-i];
	        }
	        Arrays.sort(d);
	     	   int right=C;
	     	   int left=-1;
	     	   while(right-left>1) {
	     		   int mid=left+(right-left)/2;
	     		   if(c[mid]<d[mid]) right=mid;
	     		   else left=mid;
	     	   }
	     	
	     	long ans=0;
	     	for(int i=0;i<X+Y-right;i++) {
	     		ans=ans+d[X+Y-i-1];
	     	}
	        for(int i=0;i<right;i++) {
	        	ans=ans+c[C-1-i];
	        }
	        
	        
	        	System.out.println(ans);
	        	        	        
	 }
}