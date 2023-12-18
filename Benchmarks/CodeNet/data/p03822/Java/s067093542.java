import java.util.*;
import java.io.PrintWriter;
public class Main{
	static ArrayList<Integer>[] map;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		map=new ArrayList[n];
		for(int i=0; i<n; i++){
			map[i]=new ArrayList<>();
		}
		for(int i=1; i<n; i++){
			map[sc.nextInt()-1].add(i);
		}
		System.out.println(dfs(0));
	}
	static int dfs(int i){
		if(map[i].size()==0){
			return 0;
		}
		ArrayList<Integer> tmp=new ArrayList<>();
		for(int j:map[i]){
			tmp.add(dfs(j));
		}
		Collections.sort(tmp);
		int re=0;
		for(int t=0; t<tmp.size(); t++){
			re=Math.max(tmp.get(t)+1,re+1);
		}
		return re;
	}
}
