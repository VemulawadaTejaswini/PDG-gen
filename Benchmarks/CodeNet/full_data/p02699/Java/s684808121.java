import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		
		int S,W;
		
		S = cin.nextInt();
		W = cin.nextInt();
		
		System.out.println(W>=S?"unsafe":"safe");
	}

}
