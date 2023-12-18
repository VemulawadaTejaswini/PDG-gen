import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a+b>d+c)System.out.println("Left");
		else if(a+b<d+c)System.out.println("Right");
		else System.out.println("Balanced");
	}
}