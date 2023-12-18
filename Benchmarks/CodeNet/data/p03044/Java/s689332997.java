import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] color = new int[n+1];
		
		int u,v,w;
		
		for(int i=0;i<n-1;i++) {
			u = sc.nextInt();
			v = sc.nextInt();
			w = sc.nextInt();
			
			if(w%2==0) {
				//Even
				color[u] = Math.max(color[u],color[v]);
				color[v] = Math.max(color[u],color[v]);
			}else {
				if(color[u]==0) {
					color[v]=1;
				}else if(color[v]==0) {
					color[u]=1;
				}
			}
			
		}
		sc.close();
		for(int i=1;i<n+1;i++) {
			System.out.println(color[i]);
		}

	}

}
