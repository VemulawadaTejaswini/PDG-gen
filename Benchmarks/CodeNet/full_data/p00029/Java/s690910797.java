import java.util.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		HashMap<String,Integer> map=new HashMap<>();
		String[] str=in.nextLine().split(" ");
		
		for(int i=0;i<str.length;i++) {
			if(map.containsKey(str[i]))map.put(str[i], map.get(str[i])+1);
			else map.put(str[i],1);
		}
		
		String MUkey="",MLkey="";
		int MUN=0,MLN=0;
		for(Iterator<Map.Entry<String, Integer>> itr=map.entrySet().iterator();itr.hasNext();) {
			Map.Entry<String,Integer> etr=(Map.Entry<String, Integer>) itr.next();
			String s=etr.getKey();
			if(s.length()>MLN) {
				MLN=s.length();
				MLkey=s;
			}
			
			int u=etr.getValue();
			if(u>MUN) {
				MUN=u;
				MUkey=s;
			}
		}
		
		System.out.println(MUkey+" "+MLkey);
	}

}
