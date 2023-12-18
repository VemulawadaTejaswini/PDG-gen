
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

class main {	
	
	static Map map = new HashMap();
	
	public static void main(String[] args) throws IOException   {		
		
		Date date = new Date();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int cs = Integer.parseInt((bf.readLine().split(" ")[1]));
	
		int[][] ya = new int[cs][2];
		
		for(int i = 0; i < cs; i++ ) {	
			String[] line = bf.readLine().split(" ");
			int pt =  Integer.parseInt(line[0]);
			int ys =  Integer.parseInt(line[1]);
			ya[i][0] = pt;
			ya[i][1] = ys;
			addData(pt, ys);
		}	
		
		for(int i = 0; i < cs; i++) {
			int pt = ya[i][0];
			int ys = ya[i][1];
			int seq = getSeq(pt, ys);
			System.out.println(getFullNumber(pt) + getFullNumber(seq));
			
		}
		
		System.out.println(new Date().getTime() - date.getTime());
		
	}		
	
	private static int getSeq(int pt, int ys) {
		TreeSet<Integer> tset = (TreeSet<Integer>) map.get(pt);
		Iterator<Integer> iterator = tset.iterator();
		int seq = 0;
		while(iterator.hasNext()) {
			seq++;
			if(iterator.next() == ys){
				break;
			}
		}
		return seq;
		
	}

	private static void addData(int pt, int ys) {
		TreeSet tset = (TreeSet) map.get(pt);		
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