import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan= null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			while(true){
				int x = scan.nextInt();
				int y = scan.nextInt();
				if((x == y) &&(x == 0))break;
				System.out.printf("%d %d\n", (int)Math.min(x,y),(int)Math.max(x, y));
			}
		}finally{
			scan.close();
		}
	}
}