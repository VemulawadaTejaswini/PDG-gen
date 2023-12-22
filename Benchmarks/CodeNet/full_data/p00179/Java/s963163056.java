import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	static Queue<State> queue=new LinkedList<>();
	static Set<String> set=new HashSet<>();
	
	static class State{
		String str1;
		int minstep;
		State(String str1, int minstep){
			this.str1=str1;
			this.minstep=minstep;
		}
	}
	
	static char change(char a, char b) {
		if(a=='b'||b=='b') {
			if(a=='r'||b=='r') {
				return 'g';
			}
			else if(a=='g'||b=='g') {
				return 'r';
			}
		}
		return 'b';
	}
	
	static String bfs() {
		while(! queue.isEmpty()) {
			State state=queue.remove();
			String s=state.str1;
			int step=state.minstep;
			set.add(s);
			String s1="", s2="";
			int count=0;
			for(int i=0; i<s.length()-1; i++) {
				if(s.charAt(i)!=s.charAt(i+1)) {
					s1=s.substring(0, i);
					s2=s.substring(i+2, s.length());
					char c=change(s.charAt(i), s.charAt(i+1));
					String sa=s1+String.valueOf(c)+String.valueOf(c)+s2;
					if(! set.contains(sa)) {
						set.add(sa);
						queue.add(new State(sa, step+1));
					}
				}
				else if(s.charAt(0)==s.charAt(i+1)) {
					count++;
				}
			}
			if(count==s.length()-1) {
				queue.clear();
				set.clear();
				return String.valueOf(step);
			}
		}
		set.clear();
		return "NA";		
		
	}
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				String str=sc.next();
				if(str.equals("0")) {
					break;
				}
				queue.add(new State(str, 0));
				set.add(str);
				System.out.println(bfs());
			}
			
		}
	}
}
