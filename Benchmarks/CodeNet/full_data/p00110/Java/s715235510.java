import java.util.Scanner;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine().replace("="," ").replace("+"," ");
			boolean sw = true;
			for(int i = 9;i >= 0;i--){
				String[] a = str.replaceAll("X",i+"").split(" ");
				BigInteger b1 = new BigInteger(a[0]);
				BigInteger b2 = new BigInteger(a[1]);
				BigInteger b3 = new BigInteger(a[2]);
				if(b3.equals(b1.add(b2))){
					sw = false;
					System.out.println(i);
					break;
				}
			}
			if(sw){
				System.out.println("NA");
			}
		}
	}
}