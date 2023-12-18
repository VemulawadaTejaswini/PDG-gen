import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int health=sc.nextInt();
		int damage=sc.nextInt();
		
		int no=health/damage;
		int rem=health%damage;
		if(rem==0)
		{
			System.out.println(no);
		}
		else
		{
			System.out.println(++no);
		}
	}
}