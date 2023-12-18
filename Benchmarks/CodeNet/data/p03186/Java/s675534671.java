import java.util.Objects;
import java.util.Scanner;

public class Main{
public static void main(String[] args){

  		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			 
			int ACookieNum = scanner.nextInt();
			int BCookieNum = scanner.nextInt();
			int CCookieNum = scanner.nextInt();
			 
			int poisonRecovery = ACookieNum + BCookieNum;
			 
			if (poisonRecovery >= CCookieNum){
			  System.out.println( BCookieNum + CCookieNum) ;
			} else {
				System.out.println( BCookieNum + CCookieNum -1); 
			}
			} finally {
				if (!Objects.isNull(scanner)) {
					scanner.close();
				}
			}
		}
}
