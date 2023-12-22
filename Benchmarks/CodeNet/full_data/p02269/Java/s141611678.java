import java.util.*;
public class Main{
	Scanner sc = new Scanner(System.in);
	
	int n;
	String text;
	String answer;
	String[] str;
	Queue<String> result = new ArrayDeque<String>();
	
	public void input() {
		n = sc.nextInt();
		str = new String[n];
		
		for(int i=0; i<n; i++) {
			text = sc.next();
			str[i] = sc.next();
			if( text.equals("find") ) {
				search(str[i], i);
				str[i] = null;
			}
		}
	}
	
	public void search(String key, int N) {
		int i;
		for(i=0; i<N; i++) {
			if( key.equals(str[i]) ) {
				result.add("yes");
				break;
			}
		}
		if(i == N) result.add("no");
	}
	
	public void output() {
		while(true) {
			answer = result.poll();
			if(answer != null) System.out.println(answer);
			else break;
		}
	}
	
	/*---作業Memo---
	 * queueの扱い方について
	 * if文やwhile文の条件の中でpollすると、その段階でキューから取り出される。
	 * pollしたものは変数に代入し、その変数の値で条件をつけた方がよい。
	 */
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}
