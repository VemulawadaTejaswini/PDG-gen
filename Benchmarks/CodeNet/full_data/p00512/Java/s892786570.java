
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
			HashMap<String,Boolean> map = new HashMap<String, Boolean>();
			ArrayList<Data> list = new ArrayList<Main.AOJ0589.Data>();
			for(int i=0;i<n;i++){
				String name = in.next();
				if(map.containsKey(name)){
					in.next();
					continue;
				}
				map.put(name,true);
				list.add(new Data(name, in.nextInt()));
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
				if(this.num>o.num)return -1;
				else if(this.num<o.num)return 1;
				else if(this.name.length()<o.name.length())return -1;
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