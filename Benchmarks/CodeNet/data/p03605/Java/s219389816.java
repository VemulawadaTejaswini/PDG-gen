import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int N=reader.nextInt();
		if (N%100==9 || N%10==9) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
 	}

}
