import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node u[] = new Node[n];
		for(int i=0; i<n; i++){
			int id = sc.nextInt();
			u[id] = new Node();
			u[id].id = id;
			u[id].k = sc.nextInt();
			u[id].p = -1;
			u[id].type = "leaf";
			if(u[id].k > 0){
				int c[] = new int[u[id].k];
				for(int k=0; k<u[id].k; k++){
					c[k] = sc.nextInt();
				}
				u[id].c = c;
				u[id].type = "internal node";
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
				break;
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
		System.out.print(sb.toString());
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