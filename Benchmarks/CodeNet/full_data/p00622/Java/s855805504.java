import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String str1 = sc.next();
			if(str1.equals("-")) break;
			LinkedList<Character> red = new LinkedList<Character>();
			LinkedList<Character> green = new LinkedList<Character>();
			LinkedList<Character> bottom = new LinkedList<Character>();
			LinkedList<Character> ans = new LinkedList<Character>();
			for(int i =0; i < str1.length(); i++){
				red.addFirst(str1.charAt(i));
			}
			str1 = sc.next();
			for(int i =0; i < str1.length(); i++){
				green.addFirst(str1.charAt(i));
			}
			str1 = sc.next();
			for(int i =0; i < str1.length(); i++){
				bottom.addFirst(str1.charAt(i));
			}
			char cand = green.removeLast();
			while(! red.isEmpty() || ! green.isEmpty()){
				if(bottom.contains(cand)){
					cand = red.removeLast();
				}
				else{
					ans.addLast(cand);
					cand = green.removeLast();
				}
			}
			if(!bottom.contains(cand)){
				ans.addLast(cand);
			}
			//print
			for(int i=0; i < ans.size();i++){
				System.out.print(ans.get(i));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}