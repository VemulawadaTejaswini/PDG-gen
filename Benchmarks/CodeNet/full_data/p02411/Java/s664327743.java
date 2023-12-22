import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	StringBuffer buf =new StringBuffer();
    	int m,f,r,u;
    	while(true){
    	    m = sc.nextInt();
    	    f = sc.nextInt();
    	    r = sc.nextInt();
    	    u = m+f;
    	    if(m==-1&&f==-1&&r==-1){
    	    	System.out.print(buf);
    	        break;
    	    }



    	    if(m==-1||f==-1){
    	            buf.append("F").append("\n");
    	    }else if(80<=u){
    	    	buf.append("A").append("\n");
    	    }else if(65<=u&&u<80){
    	    	buf.append("B").append("\n");
    	    }else if(50<=u&&u<65){
    	    	buf.append("C").append("\n");
    	    }else if(30<=u&&u<50){
    	         if(50<=r){
    	        	 buf.append("C").append("\n");
    	         }else{
    	        	 buf.append("D").append("\n");
    	         }
    	    }else{
    	    	buf.append("F").append("\n");
    	    }
    }
}
}