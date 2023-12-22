import java.util.*;
import java.util.Map.Entry;

//文字操作
class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		Hashtable<Integer,Integer> data1=new Hashtable<Integer, Integer>();
		Hashtable<Integer,Integer> data2=new Hashtable<Integer, Integer>();

		while(sc.hasNext()){
			String[] str=sc.nextLine().split(",");
			if("".equals(str[0]))break;
			int[] vals=new int[]{Integer.parseInt(str[0]),Integer.parseInt(str[1])};
			if(data1.containsKey(vals[0])){
				data1.put(vals[0],data1.get(vals[0])+1);
			}else{
				data1.put(vals[0],1);
			}
		}
		while(sc.hasNext()){
			String[] str=sc.nextLine().split(",");
			if("".equals(str[0]))break;
			int[] vals=new int[]{Integer.parseInt(str[0]),Integer.parseInt(str[1])};
			if(data2.containsKey(vals[0])){
				data2.put(vals[0],data2.get(vals[0])+1);
			}else{
				data2.put(vals[0],1);
			}
		}
		ArrayList<Entry<Integer,Integer>> data1list=new ArrayList<Entry<Integer,Integer>>(data1.entrySet());
		Collections.sort(data1list,new Comparator<Entry<Integer,Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				return o1.getKey()-o2.getKey();
			}
		});
		for(Entry<Integer,Integer> entry:data1list){
			if(data2.containsKey(entry.getKey())){
				ln(entry.getKey()+" "+ (entry.getValue()+data2.get(entry.getKey())));
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