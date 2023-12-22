import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan= null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			int k;
			for(int i = 1; (k = scan.nextInt()) != 0;i++){
				System.out.println("Case "+i+": "+k);
			}
		}finally{
			scan.close();
		}
	}
}