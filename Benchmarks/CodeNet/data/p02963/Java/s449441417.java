import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=0;
        long b=0;
        long c=0;
        long d=0;
        
        long S = sc.nextLong();
        a = (long) Math.sqrt(S);
        d = a;
        if(S!=a*d) {
        long w = S -(a*d);
        if (w<100000000) {
        	b=w;
        	c=1;
        } else {
        	for (int i=100; i>1; i--) {
        		if(w%i==0) {
        			b=w/i;
        			c=i;
        			break;
        		}
        	}
        }
        }
        System.out.println("0 0 " + a + " " + b + " " + c + " " + d);	
        
        
    }
}