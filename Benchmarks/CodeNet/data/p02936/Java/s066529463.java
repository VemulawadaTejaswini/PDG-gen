import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int nodeNum = sc.nextInt();
		int operationNum = sc.nextInt();
		List<List<Integer>> children = new ArrayList<>(nodeNum+1);
		for(int i = 0; i <= nodeNum; i++)children.add(new ArrayList<Integer>());
		for(int i = 1; i < nodeNum; i++){
			children.get(sc.nextInt()).add(sc.nextInt());
		}

		Dfs dfs = new Dfs(nodeNum);
		for(int i = 0; i < operationNum; i++){
			int root = sc.nextInt();
			int cnt = sc.nextInt();

			dfs.dfs(root, children, cnt);
		}

		System.out.println(dfs.toString());
	}
}

class Dfs {
	int[] ans;
	Dfs(int n) {
		ans = new int[n];
	}
	void dfs (int root, List<List<Integer>> children, int cnt) {
		List<Integer> checking = new ArrayList<>();
		checking.add(root);
		List<Integer> old, add;
		while(checking.size() > 0){
			old = new ArrayList<>(checking);
			add = new ArrayList<>();
			for(int i : checking){
				ans[i-1] += cnt;
				for(int j : children.get(i)){
					add.add(j);
				}
			}
			checking.removeAll(old);
			checking.addAll(add);
		}
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i : ans){
			sb.append(i);
			sb.append(" ");
		}
		return sb.toString().trim();
	}
}

