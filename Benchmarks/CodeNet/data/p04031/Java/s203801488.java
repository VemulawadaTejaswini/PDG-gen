import java.util.*;
public class Main {
    
    static int[] n = null;
	// Brute force. Not sure if there is a math way to decompose the problem
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,NOC=sc.nextInt(),i=0;
        int ans = -1, m=Integer.MAX_VALUE, sum=0;
        n = new int[NOC];
        while (NOC-->0) {
            int no = sc.nextInt();
            if(no<min) min=no;
            if(no>max) max=no;
            n[i++]=no; sum+=(no<0) ? no : 0;
        }
        for (i=(min<0) ? 0: min; i<=((max<0) ? 0 : max); i++) {
            int len=n.length,s=sum;
            for (int j=0; j<len; j++) s+=(n[j]>0) ? ((n[j]-i)*(n[j]-i)) : 0;
            if(s<m) { m=s; ans=i; }
        }
        System.out.println(m<0 ? 0 : m);
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}   
