import java.util.*;

public class Main {
	private static Integer fuctorial( Integer num , Integer fuc){
		if( fuc == 1 ) {
			return num;
		}
		return num * fuctorial( num, (fuc - 1) );
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String sdata = sc.next();
	    try{
	       Integer idata = Integer.parseInt(sdata);
	       System.out.println(fuctorial(idata, 3));
	    } catch (Exception e) {
	    	
	    }
	}
}
