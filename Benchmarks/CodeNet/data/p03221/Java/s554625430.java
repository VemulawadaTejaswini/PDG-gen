
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Main{	
	
	
	
	public static void main(String[] args) throws IOException   {		
		
		Map<Integer, TreeSet<Integer>> map = new HashMap<Integer, TreeSet<Integer>>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int cs = Integer.parseInt((bf.readLine().split(" ")[1]));
	
		int[][] ya = new int[cs][2];
		
		for(int i = 0; i < cs; i++ ) {	
			String[] line = bf.readLine().split(" ");
			int pt =  Integer.parseInt(line[0]);
			int ys =  Integer.parseInt(line[1]);
			ya[i][0] = pt;
			ya[i][1] = ys;
			setData(pt, ys, map);
		}	
		
		Map <Integer,  Map<Integer, Integer>> retMap = createSequMap(map);
		
		for(int i = 0; i < cs; i++) {
			int pt = ya[i][0];
			int ys = ya[i][1];
			
			System.out.println(getFullNumber(pt) + getFullNumber(retMap.get(pt).get(ys)));
			
		}
	
		
	}		
	

	
	private static Map<Integer, Map<Integer, Integer>> createSequMap(Map<Integer, TreeSet<Integer>> map){
		Set<Integer> keys = map.keySet();
		Map<Integer,  Map<Integer, Integer>> retMap = new HashMap<Integer,  Map<Integer, Integer>> ();
		for(int pt:keys) {
			Map<Integer, Integer> seqMap = new HashMap<Integer, Integer>();
			TreeSet<Integer>  tset = (TreeSet<Integer> ) map.get(pt);	
			Iterator<Integer> iterator = tset.iterator();
			int seq = 0;
			while(iterator.hasNext()) {
				seqMap.put(iterator.next(), ++seq);
			}
			
			retMap.put(pt, seqMap);
		}
		return retMap;
	}

	private static void setData(int pt, int ys, Map<Integer, TreeSet<Integer>> map) {
		TreeSet<Integer> tset = (TreeSet<Integer>) map.get(pt);		
		if(tset == null) {
			tset = new TreeSet<Integer>();			
			map.put(pt, tset);
		}
		tset.add(ys);
	}
	


	private static String getFullNumber(int number) {
		String n = String.valueOf(number);
		int len = 6 - n.length();
		for(int i = 0; i < len; i++) {
			n = "0" + n;
		}
		return n;
	}

}