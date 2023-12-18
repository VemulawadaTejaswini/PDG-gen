import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		switch (age){
			case 3:
				System.out.println("YES");
				break;
			case 5:
				System.out.println("YES");
				break;
			case 7:
				System.out.println("YES");
				break;
			default:
				System.out.println("NO");
				break;
		}
	}
}