import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long A=stdIn.nextLong()*100;
		double B=stdIn.nextDouble()*100;
		System.out.println(A*B/100);
	}
}
