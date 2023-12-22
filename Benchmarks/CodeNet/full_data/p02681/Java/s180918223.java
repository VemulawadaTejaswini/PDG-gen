import java.util.*;
public class Main{ 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		boolean find = false;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != b.charAt(i)){
				System.out.println("No");
				find = true;
				break;
			}
		}
		if(!find)
			System.out.println("Yes");
    }
}