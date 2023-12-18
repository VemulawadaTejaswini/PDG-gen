import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==0 || b==0 || (a<0 && b>0)) System.out.println("Zero");
		else if(b<0 && (b-a)%2==0) System.out.println("Negative");
		else System.out.println("Positive");
	}
}