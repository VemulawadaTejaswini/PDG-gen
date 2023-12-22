
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> result = new ArrayList<String>();
		
		int num = sc.nextInt();
		

		for(int i = 0; i < num; i++){
			result.add(isTriangle(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
	
	private static String isTriangle(int x, int y, int z){
		int x2 = x * x;
		int y2 = y * y;
		int z2 = z * z;
		
		if(x2 + y2 == z2){
			return "YES";
		}
		else if(y2 + z2 == x2){
			return "YES";
		}
		else if(z2 + x2 == y2){
			return "YES";
		}
		else{
			return "NO";
		}
	}
}