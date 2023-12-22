import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("?a");
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		while(true){
			String s = sc.next();
			if(list.contains(s)==true || s.length()==1 || s.charAt(0)!='a'){
				System.out.println("!OUT");
				break;
			}
			list.add(s);
			if(s.compareTo("aa")==0) System.out.println("?aaa");
			else System.out.println("?" + s.charAt(1) + "a");
		}	
	}	
}