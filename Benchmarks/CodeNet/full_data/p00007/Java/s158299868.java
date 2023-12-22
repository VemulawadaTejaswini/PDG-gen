import java.util.*;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int debt = 100000;
		
		for(int i = 0; i < n; i++){
			debt *= 1.05;
		}
		
		if(debt % 10000 != 0){
			debt = (debt / 10000 + 1) * 10000;
		}
		
		System.out.println(debt);
	}
}