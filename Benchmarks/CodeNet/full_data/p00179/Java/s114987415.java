import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new  Scanner(System.in);
		label:while(true){
			char[] s = (cin.next()).toCharArray();
			if(s[0]=='0'){
				break;
			}
			if(all(s)){
				System.out.println(0);
				continue;
			}
			HashSet<String> map = new HashSet<String>();
			Queue<char[]> q = new LinkedList<char[]>();
			Queue<Integer> depth = new LinkedList<Integer>();
			q.add(s);
			depth.add(0);
			label2:while(!q.isEmpty()){
				char[] ss = q.poll();
				int dep = depth.poll();
				for(int i = 0; i < s.length-1;i++){
					if(ss[i]!=ss[i+1]){
						char[] next = change(ss,i);
						if(map.contains(String.valueOf(next))){
							//System.out.println("onaji");
							continue;
						}
						if(all(next)){
							System.out.println(dep+1);
							continue label;
						}
						map.add(String.valueOf(next));
						q.add(next);
						depth.add(dep+1);
					}
				}
			}
			System.out.println("NA");
		}
	}
	static boolean all(char[] s){
		for(int i = 0;i<s.length-1;i++){
			if(s[i]!=s[i+1]){
				return false;
			}
		}
		return true;
	}
	static char[] change(char[] s,int x){
		char[] re = s.clone();

		if(re[x]!='r'&&re[x+1]!='r'){
			re[x]='r';
			re[x+1]='r';
		}
		else if(re[x]!='g'&&re[x+1]!='g'){
			re[x]='g';
			re[x+1]='g';
		} 
		else{
			re[x]='b';
			re[x+1]='b';
		}
		return re;
	}
}