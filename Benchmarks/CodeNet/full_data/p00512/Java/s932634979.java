
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0589().doIt();
	}
	
	class AOJ0589{
		void doIt(){
			int n = in.nextInt();
			HashMap<String,Data> map = new HashMap<String, Data>();
			for(int i=0;i<n;i++){
				String name = in.next();
				if(map.containsKey(name)){
					map.get(name).num+=in.nextInt();
					continue;
				}
				map.put(name,new Data(name, in.nextInt()));
			}
			ArrayList<Data> list = new ArrayList<Data>();
			for(String key:map.keySet()){
				list.add(map.get(key));
			}
			Collections.sort(list);
			for(int i=0;i<list.size();i++)System.out.println(list.get(i));
		}
		class Data implements Comparable<Data>{
			String name;
			int num;
			public Data(String name,int num) {
				this.name = name;
				this.num = num;
			}
			public int compareTo(Data o) {
				if(this.name.length()<o.name.length())return -1;
				else if(this.name.length()>o.name.length())return 1;
				else if(this.name.compareTo(o.name)<0)return -1;
				else if(this.name.compareTo(o.name)>0)return 1;
				return 0;
			}
			public String toString(){
				return name+" "+num;
			}
		}
	}
	
	
	class AOJ0571{
		void doIt(){
			char[] input = in.next().toCharArray();
			int result = 0;
			int n = input.length;
			
			System.out.println(result);
		}
	}
	
}