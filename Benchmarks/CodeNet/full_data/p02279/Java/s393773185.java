import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node u[] = new Node[n];
		Node u_wk;
		for(int i=0; i<n; i++){
			u[i] = new Node();
			u[i].id = sc.nextInt();
			u[i].k = sc.nextInt();
			u[i].p = -1;
			u[i].type = "leaf";
			if(u[i].k > 0){
				int c[] = new int[u[i].k];
				for(int k=0; k<u[i].k; k++){
					c[k] = sc.nextInt();
				}
				u[i].c = c;
				u[i].type = "internal node";
			}
		}

		for(int i=0; i<n-1; i++){
			for(int j=n-1; j>=i+1; j--){
				if(u[j].id < u[j-1].id){
					u_wk   = u[j];
					u[j]   = u[j-1];
					u[j-1] = u_wk;
				}
			}
		}

		for(int i=0; i<n; i++){
			for(int k=0; k<u[i].k; k++){
				u[u[i].c[k]].p = u[i].id;
			}
		}

		for(int i=0; i<n; i++){
			if(u[i].p == -1){
				u[i].type = "root";
				for(int k=0; k<u[i].k; k++){
					setD(u, u[i].c[k], 1);
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++){
			sb.append("node "+u[i].id+": parent = "+u[i].p+", depth = "+u[i].d+", "+u[i].type+", [");
			for(int k=0; k<u[i].k; k++){
				if(k==0) sb.append(u[i].c[k]);
				else     sb.append(", "+u[i].c[k]);
			}
			sb.append("]\n");
		}
		System.out.println(sb.toString());
	}
	static void setD(Node u[], int c, int d){
		u[c].d = d;
		d++;
		for(int k=0; k<u[c].k; k++){
			setD(u, u[c].c[k], d);
		}
	}
}
class Node{
	int id;
	int k;
	int c[];
	int p;
	int d;
	String type;
}