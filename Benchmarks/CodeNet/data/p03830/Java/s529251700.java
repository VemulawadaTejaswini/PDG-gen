import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int H = 1005;
	        int[] m = new int[H];
	        int[] p = new int[H];
	        int k=0;
	        for(int i=2;i<H;i++) {
	        	if(m[i]==0) {
	        		m[i]=1;
	        		p[k]=i;
	        		k++;
	        		for(int j=i+i;j<H;j=j+i) {
	        			m[j]=i;
	        		}
	        	}
	        }	        
	        
	        long tmp=1;
	        int[] list=new int[10001];
	        for(int i=2;i<=N;i++) {
	        	int t=i;
	        	while(m[t]>1) {
	        		list[m[t]]++;
	        		t=t/m[t];
	        	}
	        	list[t]++;
	        }
	        long ans=1;
	        for(int i=2;i<1000;i++) {
	        	ans=(ans*(list[i]+1))%mod;
	        }
	        System.out.println(ans);
	 }
	 

}