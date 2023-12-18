import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int A=s.nextInt();
		String op=s.next();
		int B=s.nextInt();
		
		if(op.charAt(0)=='+'){
			System.out.print(A+B);
		}else System.out.print(A-B);
		

	}

}
