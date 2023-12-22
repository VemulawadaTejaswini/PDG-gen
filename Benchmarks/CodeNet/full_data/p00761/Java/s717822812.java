import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AOJ1180().doIt();
	}
	
	class AOJ1180{
		int input,l;
		
		int rehyou(int a){
			int result = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			String b = Integer.toString(a);
			for(int i=0;i<Integer.toString(a).length();i++)list.add(Integer.parseInt(b.charAt(i)+""));
			while(list.size()<l)list.add(0);
			Collections.sort(list);
			int c=0,d=0;
			for(int i=list.size()-1;i>=0;i--){
				c*=10;
				c+=list.get(i);
			}
			for(int i=0;i<list.size();i++){
				d*=10;
				d+=list.get(i);
			}
			return c-d;
		}
		
		void solve(){
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int a = input;
			map.put(a, 0);
			for(int i=1;;i++){
				a = rehyou(a);
				if(map.containsKey(a)){
					System.out.print(map.get(a)+" ");
					System.out.print(a+" ");
					System.out.println(i-map.get(a));
					break;
				}
				map.put(a, i);
			}
		}
		
		void doIt(){
			while(in.hasNext()){
				input = in.nextInt();
				l = in.nextInt();
				if(input+l == 0)break;
				solve();
			}
		}
	}
	
}