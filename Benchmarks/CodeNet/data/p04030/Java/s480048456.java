import java.util.*;

public class Main {

	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
				
		StringBuilder sb = new StringBuilder();
		
		for (char c : a.toCharArray()){
			
			if(c != 'B'){
				sb.append(a);
			}
			else{
				if(sb.length() != 0){
					sb.deleteCharAt(sb.length() - 1);
				}
			}
		}
		System.out.println(sb.toString());
	}
}
