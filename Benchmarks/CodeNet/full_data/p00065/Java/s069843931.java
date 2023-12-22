import java.util.*;
public class Main {
	static List<Integer> sengetu = new ArrayList<Integer>();
	static List<Integer> result = new ArrayList<Integer>();
	static boolean hantei(int n){
		for(int i=0;i<sengetu.size();i++)if(n==sengetu.get(i))return true;
		return false;
	}
	static boolean hantei2(int n){
		for(int i=0;i<result.size();i++)if(n==result.get(i))return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean sw=false;
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();//数をカウント
		while(in.hasNext()){
			String input = in.nextLine();
			if(input.length()==0){
				sw=true;
				continue;
			}
			String data[] = input.split(",");
			int ban=Integer.parseInt(data[0]);
			int num=Integer.parseInt(data[1]);
			if(m.containsKey(ban)){
				m.put(ban,m.get(ban)+1);
			}else m.put(ban,1);
			if(!sw)if(!hantei(ban))sengetu.add(ban);
			if(sw)if(hantei(ban))if(!hantei2(ban))result.add(ban);
		}
		Collections.sort(result);
		for(int i=0;i<result.size();i++)System.out.println(result.get(i)+" "+m.get(result.get(i)));
	}
}