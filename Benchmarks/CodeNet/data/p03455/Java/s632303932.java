import java.util.*;
public class AProduct20181103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a*b)%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}