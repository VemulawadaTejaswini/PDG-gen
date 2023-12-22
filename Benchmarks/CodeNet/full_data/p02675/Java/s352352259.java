import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int n = N % 10;
		
		switch(n){
		case 0:
		case 1:
		case 6:
		case 8:
			System.out.println("pon");
			break;
			
		case 2:
		case 4:
		case 5:
		case 7:
		case 9:
			System.out.println("hon");
			break;
			
		default:
			System.out.println("bon");
		}
		}
    }
}