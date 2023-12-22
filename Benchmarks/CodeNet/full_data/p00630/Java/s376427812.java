import java.util.*;

public class Main {
	public static void main(String[] args){
		new Main().calc();
	}

	void calc(){
		Scanner cin = new Scanner(System.in);
		while(true){
			String s = cin.next();
			String t = cin.next();
			if(t.equals("X")) break;
			List<String> l = new LinkedList<String>();
			String now = "";
			for(char c : s.toCharArray()){
				if(c=='_' || Character.isUpperCase(c)){
					if(now.length()!=0) l.add(now);
					now = "";
				}
				if(c!='_') now += c;
			}
			if(now.length()!=0) l.add(now);
			int count = 0;
			for(String ss: l){
				int count2 = 0;
				for(char c : ss.toCharArray()){
					if(count2 == 0 && !t.equals("D") && !(t.equals("L") && count==0)){
						System.out.print(Character.toUpperCase(c));
					}
					else System.out.print(Character.toLowerCase(c));
					count2++;
				}
				count++;
				if(count!=l.size() && t.equals("D")) System.out.print("_");
			}
			System.out.println();
		}
	}
}