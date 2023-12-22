import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int q = Integer.parseInt(str[0]);
		SortedMap<String, Integer> mpa = new TreeMap<String, Integer>();
		for(int i = 0; i < q; i++){
			str = br.readLine().split(" ");
			int op = Integer.parseInt(str[0]);
			if(op == 0){
				String key = str[1];
				int x = Integer.parseInt(str[2]);
				mpa.put(key, x);
			}else if(op == 1){
				String key = str[1];
				if(mpa.containsKey(key)) System.out.println(mpa.get(key));
				else System.out.println(0);
			}else{
				String key = str[1];
				if(mpa.containsKey(key)) mpa.remove(key);
			}
		}
	}
}

