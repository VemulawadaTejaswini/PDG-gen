import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String ans = "none";


if(s.matches( "[a-z]+")){

	System.out.print(ans);
}else {
	String[] st = {s};
	Arrays.sort(st);
		if(Arrays.asList(st).contains("[a-z]+")){
			System.out.print(st[0]);
		}
	
	
		}
	}
}


