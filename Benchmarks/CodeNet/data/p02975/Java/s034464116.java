mport java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
	

	private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
	
	static boolean next_perm(char[] p, int n, int r) {
        int i, j;
        char t;
        
        if(r <= 0 || n < r) return(false);
        for(i = r + 1; i <= n-1; i++)
            for(j = i; j >= r + 1 && p[j-1] < p[j]; j--){
                t = p[j]; p[j] = p[j-1]; p[j-1] = t;    // swap(p,j,j-1);
            }
        for(i = n - 1; i > 0 && p[i-1] >= p[i]; i--);
        if(i==0) return(false);
        for(j = n - 1; j > i && p[i-1] >= p[j]; j--);
        t = p[j]; p[j] = p[i-1]; p[i-1] = t;            // swap(p,j,i-1);
        for(j=n-1; i< j; i++, j--){
            t = p[i]; p[i] = p[j]; p[j] = t;            // swap(p,i,j);
        }
        return(true);
    }
    
    static String strRev(String s) {
        char[] c=s.toCharArray();
        char t;
        
        for(int i=0, j=s.length()-1; i< j; i++,j--){
            t=c[i]; c[i]=c[j]; c[j]=t;  // swap(c,i,j);
        }
        return(new String(c));
    }
    
    public static String arrayToString(int[] array) {
        String result = "";
        for(int i : array) {
            result += i;
        }
        return result;
    }
    
    public static boolean judgement(String s) {
    	int[] a=new int[s.length()];
    	int left=0;
    	int middle=0;
    	int right=0;
    	for(int i=0;i<a.length;i++) {
    		if(i==0) {
    			left=Integer.valueOf(s.substring(a.length-1,a.length));
    			middle=Integer.valueOf(s.substring(i,i+1));
    			right=Integer.valueOf(s.substring(i+1,i+2));
    		}else if(i==a.length-1) {
    			left=Integer.valueOf(s.substring(i-1,i));
    			middle=Integer.valueOf(s.substring(i,i+1));
    			right=Integer.valueOf(s.substring(0,1));
    			
    		}else {
    			left=Integer.valueOf(s.substring(i-1,i));
    			middle=Integer.valueOf(s.substring(i,i+1));
    			right=Integer.valueOf(s.substring(i+1,i+2));
    		}
    		
    		if((left^right)==middle) {
    			return true;
    		}
    		
    	}
    	
    	
    	return false;
    }
	 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		
		int K=sc.nextInt();
		int[] a=new int[K];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		final int N=a.length;
        final int R=N;
        String P=arrayToString(a);
        char[] p=P.toCharArray();
		String s="";
		
        do{
        	String t=new String(p);
            if(!s.contains(t)) {
            	 flag = judgement(t);
            	 if(flag) {
            		 break;
            	 }
                 s+=t+t+"|";
                 t=strRev(t);
                 s+=t+t+"|";
            }
        }while(next_perm(p,N,R));
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
}
}