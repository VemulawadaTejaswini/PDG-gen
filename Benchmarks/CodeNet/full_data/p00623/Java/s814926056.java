import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				/* input */
				String line = br.readLine();
				if(line.equals("END")) break;
				
				
				int n = Integer.parseInt(br.readLine());
				
				int[] l = new int[n+1];

				for(int i=1;i<=n;i++){
					String line2 = br.readLine().replaceAll(" ","");
					l[i] = Integer.parseInt(line2,2);
				}
				

				Node t = makeTree(line,0,l);
				//t.output();
				
				int ans = 0;
				t = check(t,l);
				for(int c : t.cand){
					if(c==15) ans++;
				}
				
				System.out.println(ans);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	static class Node{
		int v;
		int level;
		Node left,right;
		ArrayList<Integer> cand;
		
		public Node(int d){
			this.v = 0;
			this.level = d;
			this.left = null;
			this.right = null;
			this.cand = new ArrayList<Integer>();
		}
		
		public void output(){
			if(this.v!=0){
				System.out.print(this.v);
			} else {
				System.out.print("(");
				this.left.output();
				System.out.print(" ");
				this.right.output();
				System.out.print(")");
			}
		}
	}

	public static Node makeTree(String s, int d, int[] l){
		Node t = new Node(d);
		if(s.length()==1){
			t.v = Integer.parseInt(s);
			t.cand.add(l[t.v]);
			//System.err.println(t.cand.size());
		} else {
			int level = 0;
			int index = 0;
			
			while(true){
				if(s.charAt(index)=='('){
					level++;
				} else if(s.charAt(index)==')'){
					level--;
				} else if(s.charAt(index)==' '&&level==1){
					break;
				}
				index++;
			}
			t.left = makeTree(s.substring(1,index),d+1,l);
			t.right = makeTree(s.substring(index+1, s.length()-1),d+1,l);
		}
		return t;
	}
	
	public static Node check(Node r, int[] l){
		if(r.left==null&&r.right==null){
			return r;
		}
		
		//if node r does not have grand-children
		if(r.left.left==null&&r.right.left==null){
			r.cand.add(r.left.cand.get(0)&r.right.cand.get(0));
			r.cand.add(r.left.cand.get(0)|r.right.cand.get(0));
			r.cand.add(r.left.cand.get(0)^r.right.cand.get(0));
		} else {//if r has grand-children
			r.left = check(r.left,l);
			r.right = check(r.right,l);
			//System.err.println(r.left.cand.size() + ", " + r.right.cand.size());
			for(int c1 : r.left.cand){
				for(int c2 : r.right.cand){
					r.cand.add(c1&c2);
					r.cand.add(c1|c2);
					r.cand.add(c1^c2);
				}
			}
		}
		return r;
	}
}