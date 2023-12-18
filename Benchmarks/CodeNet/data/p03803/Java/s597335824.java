import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt(),B=sc.nextInt();
		if(A>B){
			System.out.println("Alice");
		}
		else if(A==B){
			System.out.println("Draw");
		}
		else{
			System.out.println("Bob");
		}
	}
}