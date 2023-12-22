import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	for(int i = 0; i < n; ++i){
	    BigInteger bi1 = new BigInteger(sc.next());
	    BigInteger bi2 = new BigInteger(sc.next());

	    System.out.println((bi1.add(bi2)).toString());
	}
    }
}