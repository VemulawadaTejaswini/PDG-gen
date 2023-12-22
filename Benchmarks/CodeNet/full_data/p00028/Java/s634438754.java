import java.util.*;
import java.util.Map.Entry;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		Hashtable<Integer,Integer> vals = new Hashtable<Integer, Integer>();
		while (sc.hasNext()) {
			int m = sc.nextInt();
			if(vals.containsKey(m)){
				vals.put(m,vals.get(m)+1);
			}else{
				vals.put(m,0);
			}
		}
		
		ArrayList<Entry<Integer,Integer>> valList=new ArrayList<Entry<Integer,Integer>>(vals.entrySet());
			
		Collections.sort(valList,new Comparator<Entry<Integer,Integer>>() {
@Override
		public int compare(Entry<Integer, Integer> o1,
				Entry<Integer, Integer> o2) {
	if(o2.getValue()!=o1.getValue())return o2.getValue()-o1.getValue();
	else	return o1.getKey()-o2.getKey();
		}
		});
		
		int max=0;
		for(Entry<Integer,Integer> val:valList) {
			if(val.getValue()>=max){
				max=val.getValue();
				ln(val.getKey());
			}else{
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}