import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

//Old Memories
public class Main{

	int d, n, min, S;
	String[] piece;
	Set<String> cand, res, head;
	char[] c;
	
	void dfs(int rest, String s){
		if(cand.contains(s))res.add(s);
		if(rest==0)return;
		StringBuffer sb = new StringBuffer(s);
//		if(rest==2){
			//remove
			for(int i=0;i<sb.length();i++){
				char ch = sb.charAt(i);
				sb.deleteCharAt(i);
				dfs(rest-1, sb.toString());
				sb.insert(i, ch);
			}
			//insert
			for(int i=0;i<=sb.length();i++)for(int j=0;j<27;j++){
				sb.insert(i, c[j]);
				dfs(rest-1, sb.toString());
				sb.deleteCharAt(i);
			}
			//change
			for(int i=0;i<sb.length();i++)for(int j=0;j<27;j++){
				char ch = sb.charAt(i);
				sb.setCharAt(i, c[j]);
				dfs(rest-1, sb.toString());
				sb.setCharAt(i, ch);
			}
//		}
//		else{
//			
//		}
		
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		c = new char[27];
		for(int i=0;i<26;i++)c[i]=(char)(i+'A');
		c[26] = '.';
		for(;;){
			d = sc.nextInt(); n = sc.nextInt();
			if((d|n)==0)break;
			String s = sc.next();
			S = s.length();
			cand = new HashSet<String>();
			piece = new String[n];
			min = 20;
			Set<String> set = new HashSet<String>();
			for(int i=0;i<n;i++){
				piece[i] = sc.next();
				set.add(piece[i]);
				min = Math.min(min, piece[i].length());
			}
			head = new HashSet<String>();
			for(int i=0;i<n;i++)head.add(piece[i].substring(0, min));
			while(!set.isEmpty()){
				Set<String> next = new HashSet<String>();
				for(String t:set){
					if(S-d<=t.length()&&t.length()<=S+d)cand.add(t);
					for(int i=0;i<n;i++)for(int k=0;k<piece[i].length();k++){
						if(piece[i].startsWith(t.substring(t.length()-k))){
							String nr = t + piece[i].substring(k);
							if(nr.length()<=S+d)next.add(nr);
						}
					}
				}
				set = next;
			}
//			System.out.println(cand.size());
//			for(String r:cand)System.out.println(r);
			res = new HashSet<String>();
			dfs(d, s);
			int R = res.size();
			System.out.println(R);
			if(R<=5){
				PriorityQueue<String> q = new PriorityQueue<String>();
				for(String r:res)q.add(r);
				while(!q.isEmpty())System.out.println(q.poll());
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}