
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int total = 0;
        
        for(int i=a;i>0;i--)
        total=total+i;
        
        System.out.println(total);
	}
}