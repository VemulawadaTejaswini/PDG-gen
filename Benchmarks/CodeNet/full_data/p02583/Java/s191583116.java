import java.util.Scanner;

public class Main {
	 public static void main(String args[]){
	    	Scanner scanner = new Scanner(System.in);

	    	int n=scanner.nextInt();
	    	Integer[] m=new Integer[n];
	    	int t=0;

	    	int a=0;
	    	int b=0;
	    	int c=0;


	    	for(int h=0;h<n;h++) {
	    		m[h]=scanner.nextInt();
	    	}

	    	for(int j=0;j<n;j++) {
	    		a=m[j];
	    		for(int i=0;i<n;i++) {
	    			b=m[i];
	    			for(int k=0;k<n;k++) {
	    				c=m[k];
	    		if(a!=b && a!=c) {

	    				if(c<b) {
	    					int s=c;
	    					c=b;
	    					b=s;
	    			}
	    				if(c<a) {
	    					int s=c;
	    					c=a;
	    					a=s;
	    				}
	    				if(b<a) {
	    					int s=b;
	    					b=a;
	    					a=s;
	    				}
	    			if((a+b)>c && (c-a-b)<0) {
	    				t=t+1;
	    			}


	    		}

	    	}}}
	    	System.out.println(t);





	    	 }
}
