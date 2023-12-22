import java.util.*;
import java.io.*;
public class Main {

	static Scanner inp= new Scanner(System.in);
	static PrintWriter out= new PrintWriter(System.out);
	public static void main(String args[]) {		    	
	   	Main g=new Main();
	   	g.main();
	   	out.close();
	}

	boolean vis[];
	int n;
	ArrayList<Integer> list[];
	
	//Main
	void main() {
		
		n=inp.nextInt();
		list=new ArrayList[n];
		vis=new boolean[n];
		for(int i=0;i<n;i++) {
			list[i]=new ArrayList<Integer>();
		}
		int m=inp.nextInt();
		while(m-->0) {
			int x=inp.nextInt()-1;
			int y=inp.nextInt()-1;
			list[x].add(y);
			list[y].add(x);
		}
		int gg=0;
		for(int i=0;i<n;i++) {
			if(!vis[i]) {
				gg=Math.max(gg,dfs(i));
			}
		}
		System.out.println(gg);
	}
    
    int dfs(int i) {
    	vis[i]=true;
    	int c=0;
    	for(int x: list[i]) {
    		if(!vis[x]) c+=dfs(x);
    	}
    	return c+1;
    }
		
}
