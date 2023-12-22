import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> SL = new ArrayList<String>();
		while(true){
			int num = Integer.parseInt(in.readLine());
			if(num == 0){
				break;
			}
			HashSet<Integer> over = new HashSet<Integer>();
			HashMap<Integer,Integer> sale = new HashMap<Integer,Integer>();
			for(int i = 0;i<num;i++){
				String[] ss = in.readLine().split(" ");
				int ss0 = Integer.parseInt(ss[0]);
				if(!over.contains(ss0)){	
					if(!sale.containsKey(ss0)){	
						sale.put(ss0,0);
					}
					long s = (long)sale.get(ss0)+Long.parseLong(ss[1])*Long.parseLong(ss[2]);
					
					if(s > 999999){
						over.add(ss0);
					}
					else{
						sale.put(ss0,(int)s);
					}
				}
			}
			ArrayList<Integer> SSS = new ArrayList<Integer>(over);
			Collections.sort(SSS);
			if(SSS.size() == 0){
				SL.add("NA");
			}
			else{
				for(Integer i :SSS){
					SL.add(i.toString());
				}
				
			}
			
		}
		for(String s : SL){
			System.out.println(s);
		}

	}

}