import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < N; i++){
			int a = in.nextInt();
			Integer count = map.get(a);
			if(count == null) map.put(a, 1);
			else map.put(a, count+1);
		}
		
		List<Entry<Integer, Integer>> listEntries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        
		int ans = 0;
		for(Entry e : listEntries){
			if((int)e.getValue() % 2 != 0) ans++;
		}
        
        System.out.println(ans);
	}
}
