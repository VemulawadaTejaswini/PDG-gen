import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if((Y%2)==1){
			System.out.println("No");
			return;
		}
		if(Y<(X*2)){
			System.out.println("No");
			return;
		}
		if(Y>(X*4)){
			System.out.println("No");
			return;
		}
		
		System.out.println("Yes");
		return;
	}
}