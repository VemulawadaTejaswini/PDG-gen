import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		StringBuilder sub1 = new StringBuilder();
		sub1.append(sb.substring(0,len/2));
		StringBuilder sub2 = new StringBuilder();
		sub2.append(sb.substring(len/2+1));
		if(sb.toString().contentEquals(sb.reverse()) && 
		   sub1.toString().contentEquals(sub1.reverse()) &&
		   sub2.toString().contentEquals(sub2.reverse())){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
	}
}
