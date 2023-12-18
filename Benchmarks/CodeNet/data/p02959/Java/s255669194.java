import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    long[] a = new long[n+1];
		    long[] b = new long[n];
		    for(int i=0; i<n+1; i++) {
		    	a[i] = sc.nextLong();
		    }
		    for(int i=0; i<n; i++) {
		    	b[i] = sc.nextLong();
		    }

		    int monster_1 =0;
		    for(int i=n-1; i>=0; i--) {
		    	if(b[i]-a[i+1]>=0) {
		    		monster_1 += a[i+1];
		    		b[i] = b[i]-a[i+1];
		    		if(b[i]-a[i]>=0) {
		    			monster_1 +=a[i];
		    			a[i] = 0;
		    		}else {
		    			monster_1 += b[i];
		    			a[i] = a[i]-b[i];
		    		}
		    	}else {
		    		monster_1 += b[i];
		    	}
		    }
		    int monster_2=0;
		    for(int i=0; i<n; i++) {
		    	if(b[i]-a[i]>=0) {
		    		monster_2 += a[i];
		    		b[i] = b[i]-a[i];
		    		a[i] = 0;
		    		if(b[i]-a[i+1]>=0) {
		    			monster_2 += a[i+1];
		    			a[i+1]=0;
		    		}else {
		    			monster_2 += b[i];
		    			a[i+1] = a[i+1]-b[i];
		    		}
		    	}else {
		    		monster_2 += b[i];
		    	}
		    }
		    if(monster_1 > monster_2) {
		    	System.out.println(monster_1);
		    }else {
		    	System.out.println(monster_2);
		    }
	}
}
