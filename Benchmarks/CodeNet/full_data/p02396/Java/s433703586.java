import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		int t =0;
		Scanner sc = new Scanner(System.in);
		while(true){
			int x =sc.nextInt();
			if(x == 0) break;
			t++;
			System.out.println("Case "+ t + ": " + x );
		}
        
        
	}
}