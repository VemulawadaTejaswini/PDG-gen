import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int R = s.nextInt();
		
		int A = H + R;
		if(A>0){
			System.out.println("1");
		}else if(A==0){
			System.out.println("0");
		}else{
			System.out.println("-1");
		}
	}
}