import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long Q = sc.nextLong();
	        
	        int H = 100000;
	        int[] m = new int[H];
	        int[] p = new int[H];
	        int[] mlike=new int[H];
	        int k=0;
		m[1]=-1;
	        for(int i=2;i<H;i++) {
	        	if(m[i]==0) {
	        		m[i]=1;
	        		if(m[(i+1)/2]==1) {
	        			mlike[i]=1;
	        		}
	        		p[k]=i;
	        		k++;
	        		for(int j=i+i;j<H;j=j+i) {
	        			m[j]=i;
	        		}
	        	}
	        }	        
	        StringBuffer str=new StringBuffer();
	        for(int i=0;i<Q;i++) {
	        	int l=sc.nextInt();
	        	int r=sc.nextInt();
	        	int sum=0;
	        	for(int j=l;j<=r;j++) {
	        		sum=sum+mlike[j];
	        	}
	        	str.append(sum);
	        	str.append("\n");
	        }
	        System.out.println(str);
	 }
	 

}