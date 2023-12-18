import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        double sum=0;
        double sa = 0;
        int ans = 0;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        
        sa = sum/n;
      	double min = Math.abs(a[0]-sa);
      	
      	for(int i=1; i<n; i++){
      	    double diff = Math.abs(a[i]-sa);
      	    if(diff<min){
      	        min = diff;
      	        ans = i;
      	    }
        }
        
		System.out.println(ans);
    }
}
