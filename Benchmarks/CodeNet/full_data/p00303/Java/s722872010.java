import java.util.ArrayList;
import java.util.Scanner;

class Main {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int u, d;
		String code;
		boolean flag = false;
		
        Node[] nd = new Node[201];
        Edge[] eg = new Edge[n];

        for(int i = 0; i < 201; i++) {
            nd[i] = new Node();
        }
        for(int i = 0; i < n; i++) {
            u = scan.nextInt();
            code = scan.next();
            d = scan.nextInt() + 100;
             
            if(code.equals("wait")) {
                Edge tmp = new Edge(u,false);
                eg[i] = tmp;
                nd[d].next.add(tmp);
            }
            else {
                Edge tmp = new Edge(d,false);
                eg[i] = tmp;
                nd[u].next.add(tmp);
            }
        }
        
        for(int i = 0; i < 201; i++) {
            flag |= dedolo(nd,i,true,i);
            for(int j = 0; j < n; j++) {
                eg[j].use = false;
            }
        }
		
		if(flag) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		scan.close();
	}
	
    static boolean dedolo(Node[] list, int now, boolean first, int start) {
        if(!first && now == start) return true;
        boolean ret = false;
        for(int i = 0; i < list[now].next.size(); i++) {
            if(list[now].next.get(i).use) continue;
            list[now].next.get(i).use = true;
            ret |= dedolo(list,list[now].next.get(i).to,false,start);
        }
        return ret;
    }

    static class Edge {
        int to;
        boolean use;
        Edge(int to, boolean use) {
            this.to = to;
            this.use = use;
        }
    }
    
    static class Node {
        ArrayList<Edge> next = new ArrayList<Edge>();    
    }

}