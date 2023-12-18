import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static long[] kaijo;
	 static long[] kaiinv;
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String S = sc.next();
	        char[] c = S.toCharArray();
	        int N = c.length;
	        int[] m= new int[N];
	        for(int i=0;i<N;i++) {
	        	m[i]=c[i]-'a';
	        }
        	int ans=99999;
	        
	        for(int i=0;i<26;i++) {
	        	int[] t = new int[N];
	        	int cnt=0;
	        	for(int j=0;j<N;j++) {
	        		if(m[j]==i) {
	        			t[j]=1;
	        			cnt++;
	        		} else {
	        			t[j]=0;
	        		}
	        	}
//	        	if(cnt==0)continue;
	        	int length=N;
	        	int tmp=0;
	        	while(cnt<N) {
		        	for(int j=0;j<length;j++) {
		        		if(t[j]==0) {
		        			if(j==length-1) {
		        				cnt++;
		        			} else {
		        				if(t[j+1]==1) {
		        					t[j]=1;
		        					cnt++;
		        				}
		        			}
		        		}
		        	}
		        	length--;
		        	tmp++;
	        	}
	        	ans=Math.min(ans, tmp);
	        }
	        System.out.println(ans);
	        
	        
	 }

}