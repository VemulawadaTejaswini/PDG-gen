import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cases {
	public static void main(String[] args) throws IOException{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x = scan.nextInt();
		int i = 1;
		while(i != 0){
			System.out.println("Case " + i +": " + x);
			i++;
			break;
		}
	}

}