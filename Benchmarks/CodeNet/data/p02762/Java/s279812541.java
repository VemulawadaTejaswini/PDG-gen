import java.util.*;
import java.math.*;
public class Main {
	static int[] color;
	static int[] component;
	static int component_count;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		color = new int[n];
		component = new int[n];
		component_count = 1;
		User[] user = new User[n];
		for(int i = 0; i < n; i++) user[i] = new User(i);
		for(int i = 0; i < m; i++) {
			int x = in.nextInt() - 1;
			int y = in.nextInt() - 1;
			user[x].rel.add(y);
			user[y].rel.add(x);
		}
		for(int i = 0; i < k; i++) {
			int x = in.nextInt() - 1;
			int y = in.nextInt() - 1;
			user[x].blck.add(y);
			user[y].blck.add(x);
		}
		int comp_num = 0;
		int[] num_user_comp = new int[n];
		for(int i = 0; i < n; i++) {
			if(color[i] == 0) {
				component_count = 1;
				dfs(user[i], user, comp_num);
				num_user_comp[comp_num] = component_count;
				comp_num += 1;
			}
		}
		for(int i = 0; i < n; i++) {
			int ans = num_user_comp[component[i]] - 1;
			ans -= user[i].rel.size();
			for(int x : user[i].blck) {
				if(component[i] == component[x]) ans -= 1;
			}
			if(i > 0) System.out.print(" ");
			System.out.print(ans);
		}
		System.out.print("\n");
	}
	static void dfs(User root, User[] user, int comp_num) {
		color[root.id] = 1;
		component[root.id] = comp_num;
		for(int x : root.rel) {
			if(color[x] == 0) {
				dfs(user[x], user, comp_num);
				component_count += 1;
			}
		}
	}
} 
class User {
	List<Integer> rel = new ArrayList<>();
	List<Integer> blck = new ArrayList<>();
	int id;
	public User(int id) {
		this.id = id;
	}
}