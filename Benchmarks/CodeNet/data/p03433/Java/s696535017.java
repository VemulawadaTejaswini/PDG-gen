import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n, a;
		n = sc.nextInt();
		a = sc.nextInt();
		
		int i = n % 500;
		if(i == 0 || i <= a){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
