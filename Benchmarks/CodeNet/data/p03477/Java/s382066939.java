import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		
		if(a+b < c+d) System.out.println("Right");
		else if(a+b > c+d) System.out.println("Left");
		else System.out.println("Balanced");
	}

}
