import java.math.BigInteger;
import java.util.Scanner;

public class bi{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=0;i<num;i++){
			BigInteger bix = new BigInteger(scan.next());
			BigInteger biy = new BigInteger(scan.next());
			BigInteger add = bix.add(biy);
			System.out.println(add.toString());
		}
	}
}