import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0119();
	}

	class AOJ0119{
		HashMap<Integer, ArrayList<Integer>> map;
		HashMap<Integer, ArrayList<Integer>> map2;
		boolean sw[];
		boolean flg;
		int m,n;
		ArrayList<Integer> result;
		void dfs(int person,int cnt){
//			System.out.println(person+" "+cnt+" "+result.size());
			if(cnt==m){
				if(map2.get(person).size()!=0)return;
				flg=true;
				return;
			}
			if(flg)return;
			ArrayList<Integer> get_list = map2.get(person);
			for(int i=0;i<get_list.size();i++)if(!sw[get_list.get(i)]){
				sw[get_list.get(i)]=true;
				result.add(get_list.get(i));
				dfs(get_list.get(i),cnt+1);
				if(flg)return;
				result.remove(result.size()-1);
				sw[get_list.get(i)]=false;
			}
			if(map2.get(person).size()!=0)return;
			for(int key:map2.keySet())if(!sw[key]){
				sw[key] = true;
				result.add(key);
				dfs(key,cnt+1);
				if(flg)return;
				result.remove(result.size()-1);
				sw[key]=false;
			}
		}
		
		public AOJ0119() {
			map = new HashMap<Integer, ArrayList<Integer>>();
			map2 = new HashMap<Integer, ArrayList<Integer>>();
			m = in.nextInt();//容疑者数
			n = in.nextInt();//証言数
			sw = new boolean[m+1];
			result = new ArrayList<Integer>();
			for(int i=1;i<=m;i++){
				map.put(i, new ArrayList<Integer>());
				map2.put(i,new ArrayList<Integer>());
			}
			for(int i=0;i<n;i++){
				int x = in.nextInt();
				int y = in.nextInt();
				ArrayList<Integer> a = map.remove(x);a.add(y);
				map.put(x,a);
			}
//			System.out.println(map);//deba
			for(int i=1;i<=m;i++){
				for(int s=1;s<=m;s++)if(map.get(s).contains(i)){
					ArrayList<Integer> a = map2.remove(i);a.add(s);
					map2.put(i,a);
				}
			}
//			System.out.println(map2);//deba
			flg = false;sw[2]=true;result.add(2);
			dfs(2,1);
			Exception e = new Exception();
			if(result.size()!=m)
				try {
					throw e;
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			for(int i=result.size()-1;i>=0;i--)System.out.println(result.get(i));
		}
	}

}