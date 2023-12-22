//Volume1-0113
import java.util.*;

public class Main {

    public static void main(String[] args) {

    	//declare
    	int     p,q,quo,rem;
    	String  ans,rec_p;
    	boolean rec;
    	ArrayList<Integer> Rem = new ArrayList<Integer>();
    	
    	//input
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		p = sc.nextInt();
    		q = sc.nextInt();
    		
    		//initialize
    		p = (p%q)*10;
    		ans = "";
    		Rem.clear();
    		
    		//calculate
    		while(true) {
    			quo = p/q;
    			rem = p%q;
    			ans += quo;
    			if(Rem.contains(rem)){rec = true;  break;}
    			if(rem == 0)         {rec = false; break;}
    			Rem.add(rem);
    			p = rem*10;
    		}
    		//output
    		rec_p = "";
    		if(rec){
    			for(int i=0;i<ans.length();i++){
    				if   (i>Rem.indexOf(rem)){rec_p += "^";}
    				else                     {rec_p += " ";}
    			}
    		}
    		System.out.printf("%s\n%s\n",ans,rec_p);
    	}
    }
}