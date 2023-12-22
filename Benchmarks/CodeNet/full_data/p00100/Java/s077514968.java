import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> SL = new ArrayList<String>();
		while(true){
			int num = Integer.parseInt(in.readLine());
			if(num == 0){
				break;
			}
			ArrayList<String> shain = new ArrayList<String>();
			HashSet<String> over = new HashSet<String>();
			HashMap<String,Integer> sale = new HashMap<String,Integer>();
			for(int i = 0;i<num;i++){
				String[] ss = in.readLine().split(" ");
				if(!over.contains(ss[0])){	
					if(!sale.containsKey(ss[0])){	
						sale.put(ss[0],0);
						shain.add(ss[0]);
					}
					long s = (long)sale.get(ss[0])+(long)Integer.parseInt(ss[1])*(long)Integer.parseInt(ss[2]);
					
					if(s > 999999){
						over.add(ss[0]);
					}
					else{
						sale.put(ss[0],(int)s);
					}
				}
			}
			ArrayList<String> SLs = new ArrayList<String>();
			for(String s:shain){
				if(over.contains(s)){
					SLs.add(s);
				}
			}
			if(SLs.size() == 0){
				SLs.add("NA");
			}
			SL.addAll(SLs);
		}
		for(String s : SL){
			System.out.println(s);
		}

	}

}