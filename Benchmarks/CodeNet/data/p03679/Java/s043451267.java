import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static final long sosu = 1000000007;
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int X = scan.nextInt();
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			String o = "delicious";
			String s = "safe";
			String x = "dangerous"; 
			
			if(A >= B){
				System.out.println(o);
			}else if(A + X >= B){
				System.out.println(s);
			}else{
				System.out.println(x);
			}
		}
	}
}
