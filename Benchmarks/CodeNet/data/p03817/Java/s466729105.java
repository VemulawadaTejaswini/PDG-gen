import java.util.*;
import java.math.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BigInteger v = new BigInteger("11");
		BigInteger input = new BigInteger(sc.next());
		if(input.compareTo(v) <= 0){
			if(input.compareTo(new BigInteger("6")) <= 0 ){
				System.out.println(1);
			}
			else{
				System.out.println(2);
			}
		}
		else{
			BigInteger res = new BigInteger("0");
	//		System.out.println();
			res = input.divide(v).multiply(new BigInteger("2"));
	//		System.out.println("res = " + res);
	//		System.out.println(input.mod(v).compareTo(new BigInteger("6")));
			if(input.mod(v).equals(new BigInteger("0")) ){
		//		System.out.println("T");
			}
			else if(input.mod(v).compareTo(new BigInteger("6")) < 0 ){
				res = res.add(new BigInteger("1"));
			}
			else{
				res = res.add(new BigInteger("2"));
			}
			System.out.println(res);
		}
		
	}
	
}
