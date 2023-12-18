
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for (int i = 0; i < n; i++) {
        	a[i]=sc.nextLong();
		}
        Arrays.sort(a);
        long ans=a[0];
        boolean even=true;
        for(int i=0;i<n;i++) {
        	if(a[0]%2!=0) {
        		even=false;
        	}
        	
        	if(i!=0) {
        		a[i]=a[i]%ans;
        	}
        	
        }
        Arrays.sort(a);
        System.out.println(even?"2":a[n-2]==0?ans:"1");
        
    }
}
