import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner	sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int c = 0;
		for(int i=0;i<s.length();i++){
			char ch1=s.charAt(i);
			char ch2=t.charAt(i);
			if(ch1!=ch2)
				c++;
		}
		System.out.println(c);
	}
}