import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		String v=s.next();
		for(char c='a';c<='z';++c){
			if(v.indexOf(c)<0){
				System.out.println(v+c);
				return;
			}
		}

		TreeSet<Character> set=new TreeSet<>();
		set.add(v.charAt(v.length()-1));

		for(int i=v.length()-2;i>=0;--i){
			char c=v.charAt(i);
			Character h=set.higher(c);
			if(h!=null){
				System.out.println(v.substring(0,i)+h);
				return;
			}
			set.add(c);
		}

		System.out.println(-1);
	}
}