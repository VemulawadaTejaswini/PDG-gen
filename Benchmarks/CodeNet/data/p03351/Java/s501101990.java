import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(),d =sc.nextInt();
		int difAB = (int)Math.abs(a-b);
		int difBC = (int)Math.abs(b-c);
		int difAC = (int)Math.abs(a-c);
		
		if(difAB<=d && difBC<=d) {
			System.out.print("YES");
		}else if(difAC <= d){
			System.out.append("NO");
		}
	
	
	
	}
}