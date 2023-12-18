import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		s = s.replaceAll("eraser", "");
		s = s.replaceAll("dreamer", "");
		s = s.replaceAll("erase", "");
		s = s.replaceAll("dream", "");
		
		if(s.length() == 0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
		sc.close();
	}

}
