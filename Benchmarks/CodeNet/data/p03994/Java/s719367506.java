import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	char[] c = S.toCharArray();
    	int[] m=new int[c.length];
    	for(int i=0;i<c.length;i++) {
    		m[i]=c[i]-'a';
    	}
    	int K = sc.nextInt();
    	for(int i=0;i<c.length-1;i++) {
    		if(m[i]!=0) {
    			if(26-m[i]<K) {
    				K=K-26+m[i];
    				c[i]='a';
    			}
    		}
    	}
    	m[c.length-1]=(m[c.length-1]+K)%26;
    	StringBuffer ans = new StringBuffer();
    	for(int i=0;i<c.length-1;i++) {
    		ans.append(c[i]);
    	}
    	ans.append((char)(m[c.length-1]+'a'));
        System.out.println(ans);
        
        		
    }
}