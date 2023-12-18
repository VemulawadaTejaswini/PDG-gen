import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int brg[][] = new int[m + 1][2];
		int gomi;
		for (int i = 1; i <= m; i++) {
			brg[i][0] = sc.nextInt();
			brg[i][1] = sc.nextInt();
			gomi=sc.nextInt();
		}
		int ans[]=Union(n,brg);
		for (int i = 1; i <= n; i++) {
			//System.out.println(ans[i]);
		}
		for(int i=1;i<=n;i++){
			//System.out.print(ans[i]+" ");
			ans[i]=Short(i,ans);
		//System.out.println(ans[i]);
		}
int kotae=0;
for(int i=1;i<=n;i++){
if(ans[i]==i){
	kotae++;
}}
System.out.println(kotae);




	}

	public static int[] Union(int node, int list[][]) {
		int ans[] = new int[node + 1];
		for (int i = 0; i <= node; i++) {
			ans[i] = i;
		}

		for (int i = 1; i <= list.length-1; i++) {





			ans[list[i][0]] = Math
					.min(ans[list[i][0]],
							Math.min(ans[list[i][1]],
									Math.min(list[i][0], list[i][1])));
			ans[list[i][1]] = Math
					.min(ans[list[i][0]],
							Math.min(ans[list[i][1]],
									Math.min(list[i][0], list[i][1])));
		}

		return ans;
	}

	static public int Short(int node, int list[]) {
		int next;
		if (list[node] == node) {
			return node;
		} else {
			next = list[node];
			list[node] = Short(next, list);
			return list[node];
		}
	}
}