import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    long a[] = new long[n];
		    long max = 0;
		    long min = 1000000000;
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextLong();
		        max = Math.max(a[i],max);
		        min = Math.min(a[i],min);
		    }
		    System.out.println(max-min);
	        
    
	}
}
