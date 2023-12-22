//Volume2-0220
import java.util.*;

public class Main {

	public static void main(String[] args) {

		//declare
		final int    END  =  0;
		      double n;
			  String itgr,frac,ret;

    	//input
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		n = sc.nextDouble();
    		if(n<END){break;}
    		
    		//calculate
    		ret = "";
    		itgr = Integer.toBinaryString((int)Math.floor(n));
    		n %= 1.0; frac = "";
    		for(int i=0;i<4;i++){
    			frac += (int)Math.floor(n*=2);
    			n%=1;
    		}
    		
    		//output
    		if( itgr.length() > 8 || n!=0){
    			System.out.println("NA");}
    		else {
    			while(itgr.length()<8){
    				itgr="0"+itgr;
    			}
    			ret = itgr + "." + frac;
	    		System.out.println(ret);
    		}
    	}
	}
}