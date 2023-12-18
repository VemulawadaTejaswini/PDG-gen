import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		System.out.println(s.substring(1).contains(s.substring(0, 0)) && s.substring(2).contains(s.substring(1, 1)) ? "Yes" : "No");
	}
}
