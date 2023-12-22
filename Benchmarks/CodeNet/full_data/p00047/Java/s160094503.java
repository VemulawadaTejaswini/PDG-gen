import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "A";
		do{
			String t = sc.nextLine();
			if(t.equals("")) break;
			String[] temp = t.split(",");
			if(temp[0].equals(ans)) ans = new String(temp[1]);
			else if(temp[1].equals(ans)) ans = new String(temp[0]);
		} while(sc.hasNextLine());
		
		System.out.println(ans);
		

	}

}