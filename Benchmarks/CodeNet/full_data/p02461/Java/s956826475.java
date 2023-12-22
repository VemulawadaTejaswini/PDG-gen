import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		TreeMap<String,Integer> map=new TreeMap<>();
		int q=Integer.parseInt(in.next());
		for(int i=0;i<q;i++) {
			int odr=Integer.parseInt(in.next());
			
			switch(odr) {
			case 0:
				String key0=in.next();
				int x0=Integer.parseInt(in.next());
				map.put(key0,x0);
				break;
				
			case 1:
				String key1=in.next();
				Integer num1=map.get(key1);
				out.println((num1!=null)? num1:0);
				break;
				
			case 2:
				String key2=in.next();
				map.remove(key2);
				break;
				
			case 3:
				String L=in.next(),R=in.next();
				NavigableMap<String,Integer> sub=map.subMap(L, true, R, true);
				Iterator<NavigableMap.Entry<String,Integer>> itr=sub.entrySet().iterator();
				while(itr.hasNext()) {
					NavigableMap.Entry<String,Integer> entry=itr.next();
					out.println(entry.getKey()+" "+entry.getValue());
				}
			}
		}
		out.flush();
	}

}
