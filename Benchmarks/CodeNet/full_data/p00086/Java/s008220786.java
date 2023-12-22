//Volume0-0086
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Main {

	private static TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();

	public static void main(String[] args) {

		//declare
		Set<Map.Entry<Integer, Integer>> st;
		Iterator<Map.Entry<Integer, Integer>> I;
		Map.Entry<Integer, Integer> m;
		String[] s;
		String   result;
		boolean flg;
		int i,v,mk,mv;

        //input
        Scanner sc = new Scanner(System.in);
        while(true){
        	out:while(true){
        		s = sc.nextLine().split("\\s");
        		for(i=0;i<2;i++){
        			v = Integer.parseInt(s[i]);

        	    	//calculate
        			if(v == 0){break out;}
        			if   (map.get(v) != null){ map.put(v,map.get(v)+1);}
        			else                     { map.put(v,1);           }
        		}
        	}
        	flg = true;
        	st = map.entrySet();
        	I = st.iterator();
        	while(I.hasNext()){
        		m = I.next();
        		mk = m.getKey();
        		mv = m.getValue();
        		if(mk  == 1 || mk == 2){
        			if (mv%2 == 0){
        				flg = false;
        				break;
        			}
       			} else {
       				if (mv%2 != 0){
        				flg = false;
        				break;
       				}
       			}
        	}
        	if   (flg){result = "OK";}
        	else      {result = "NG";}

        	//output
        	System.out.println(result);
        }
	}
}