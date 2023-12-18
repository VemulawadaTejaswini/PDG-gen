import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(br.readLine());

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			int tmp = Integer.parseInt(tmpArray[i]);
			
			if(!map.containsKey(tmp)){
				map.put(tmp, 1);
			}
			else {
				map.put(tmp, map.get(tmp) + 1);
			}
		}
		
		Set<Integer> set = map.keySet();
		
		Iterator<Integer> it = set.iterator();
		
		int result = 0;
		
		while(it.hasNext()){
			int tmp = it.next();
			
			int count = map.get(tmp);
			
			if(tmp > count){
				result += count;
			}
			else if(tmp < count){
				result += count - tmp;
			}
		}
		
		System.out.println(result);
	}

}
