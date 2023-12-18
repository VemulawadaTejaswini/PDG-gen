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
        for(int i=1;i<n;i++) {
        	
        	
        		a[i]=a[i]%ans;
        	
        	
        }
        Arrays.sort(a);
        System.out.println(a[n-2]==0?ans:"1");
        
    }
}
