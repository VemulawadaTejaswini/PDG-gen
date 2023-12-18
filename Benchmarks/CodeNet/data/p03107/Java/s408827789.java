import java.util.Scanner;

import java.util.*;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		String n  = scan.next();

		List<Boolean> l = new ArrayList<>();

		for(int i = 0; i < n.length() ; i++){
			l.add(new Boolean(n.charAt(i) == '0'));
		}

		int remove = 0;
		while(true){
			int ret = remove(l);
			if(ret == 0){
				System.out.println(remove);
				return;
			}else{
				remove += ret;
			}
		}
	}


	static int remove(List<Boolean> l){
		Boolean p = null;
		int ret = 0;
		for(int i = 0 ; i < l.size(); i++){
			Boolean c = l.get(i);
			//			System.err.println("" + i + ":" + p +  ":" + c);
			
			if(p != null && p.booleanValue() != c.booleanValue()){
				l.remove(i);
				l.remove(i-1);
				ret += 2;
				p = null;
				//				System.err.println("remove:" + i);

			}else{
				p = c;
			}
		}
		//		System.err.println("remove result:" + ret);
		return ret;
		
	}

}
