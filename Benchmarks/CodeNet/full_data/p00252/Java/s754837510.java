import java.util.*;
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String a=sc.nextLine();
			System.err.println(a);
			if(a.equals("1 1 0")||a.equals("0 0 1"))System.out.println("Open");
			else System.out.println("Close"); 
			
	}
}