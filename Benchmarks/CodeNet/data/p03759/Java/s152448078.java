import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(Math.abs(b-a)==Math.abs(c-b))System.out.print("Yes");
		else System.out.print("No");
		
		

	}

}
