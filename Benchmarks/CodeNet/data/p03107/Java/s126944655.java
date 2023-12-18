
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int c0 = 0, c1 = 0;
		Scanner scan = new Scanner(System.in);
		while(true){
			if(!scan.hasNext())break;
			if(scan.next().equals("0"))c0++;
			else c1++;
		}
		scan.close();
		if(c0 < c1)System.out.println(c0);
		else System.out.println(c1);
		
	}
	
}