import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    long L =sc.nextLong();
	    long R = sc.nextLong();
	    int min = Integer.MAX_VALUE;
	    for(int i=0;i<2019;i++) {
	    	long num = L+i;
	    	if(num>R-1)break;
	    	if(num%2019<min) {
	    		min = (int)(num%2019);
	    	}
	    }
	    int min2 = Integer.MAX_VALUE;
	    for(int i=1;i<2019;i++) {
	    	long num = L+i;
	    	if(num>R)break;
	    	if(num%2019<min2&&num%2019!=min) {
	    		min2 = (int)(num%2019);
	    	}
	    }
	    System.out.println(min*min2);
	}



}