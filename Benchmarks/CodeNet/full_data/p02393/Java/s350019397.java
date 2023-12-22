import java.util.Scanner;

public class Main {
	static StringBuffer buf = new StringBuffer();
    public static void main (String args[]){
    	Scanner str = new Scanner(System.in);
    	int a = str.nextInt();
    	int b = str.nextInt();
    	int c = str.nextInt();

    if(c < b){
    	    if(c <a){
    	    	if(a<b){
    	    	    sum(c,a,b);
				    System.out.println(buf);
    	    	}else{
    	    		sum(c,b,a);
				    System.out.println(buf);
    	    	}
    	    }else{
    	    	if(c<b){
    	    	    sum(a,c,b);
    	    	    System.out.println(buf);
    	    	}else{
    	    		sum(a,b,c);
    	    	    System.out.println(buf);
    	    	}
    	    }
    	}else{
    		if(a < b){
    			if(b<c){
    			   sum(a,b,c);
    	    	   System.out.println(buf);
    			}else{
    			   sum(a,c,b);
     	    	   System.out.println(buf);
    			}
    	    }else{
    	    	if(a<c){
    	    	sum(b,a,c);
    	    	System.out.println(buf);
    	    	}else{
    	    		sum(b,c,a);
        	    	System.out.println(buf);
    	    	}
    	    }
    	}
    }

    static StringBuffer sum (int a,int b,int c){

    	buf.append(a);
    	buf.append(" ");
    	buf.append(b);
    	buf.append(" ");
    	buf.append(c);
    	return buf;

    }

}