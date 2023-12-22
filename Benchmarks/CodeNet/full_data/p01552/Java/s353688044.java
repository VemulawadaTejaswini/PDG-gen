import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	String query;
	ArrayList<String> ss;

	void run(){
		query=sc.nextLine();
		ss=new ArrayList<String>();
		for(; sc.hasNextLine();){
			ss.add(sc.nextLine());
		}
		solve();
	}

	void solve(){
		Node root=new Node("", "", -1, null);
		Node node=root;
		for(String line : ss){
			int depth=line.length();
			line=line.replaceAll("^ *", "");
			for(; depth<=node.depth; node=node.parent);
			if(line.charAt(line.length()-1)==':'){
				// 次にいく
				Node child=new Node(line.substring(0, line.length()-1), null,
						depth, node);
				node.children.put(child.key, child);
				node=child;
			}else{
				String key=line.split(": ")[0];
				String value=line.split(": ")[1];
				Node child=new Node(key, value, depth, node);
				node.children.put(child.key, child);
				node=child;
			}
		}
		if(false){
			LinkedList<Node> stack=new LinkedList<Node>();
			stack.push(root);
			for(; !stack.isEmpty();){
				node=stack.pop();
				String s="";
				for(int i=0; i<node.depth; i++){
					s+=" ";
				}
				s+=node.key+":"+node.value;
				debug(s, node.parent==null?"":node.parent.key);
				for(Node child : node.children.values()){
					stack.push(child);
				}
			}
		}
		String ans;
		node=root;
		for(String s : query.substring(1).split("\\.")){
			if(node.children.containsKey(s)){
				node=node.children.get(s);
			}else{
				node=null;
				break;
			}
			// debug(node.depth, node.key, node.value);
		}
		if(node==null){
			ans="no such property";
		}else if(node.children.size()>0){
			ans="object";
		}else{
			ans="string \""+node.value+"\"";
		}
		println(ans);
	}

	class Node{
		String key, value;
		int depth;
		Node parent;
		HashMap<String, Node> children;

		Node(String key, String value, int depth, Node parent){
			this.key=key;
			this.value=value;
			this.depth=depth;
			this.parent=parent;
			children=new HashMap<String, Node>();
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}