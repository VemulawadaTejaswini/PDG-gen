import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String s = stdIn.next();
		
		if(s.contains("N")&& !s.contains("S") || 
				s.contains("S") && !s.contains("N")||
				s.contains("W") && !s.contains("E")||
				s.contains("E") && !s.contains("W")){
			System.out.println("No");
		}else {
			System.out.println("Yes");
			
		}
		
		
		
		
	}

}
