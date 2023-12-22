import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String line = input.readLine();
		String[] num = line.split(" ");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		int c = Integer.parseInt(num[2]);
		int tmp = 0 ;
		
		if(a < b){
			tmp = a ;
			a = b ;
			b = tmp;
		}if(a < c){
			tmp = a ;
			a = c ;
			c = tmp ;
		}if(b < c){
			tmp = b ;
			b = c ;
			c = tmp ;
		}
		
		System.out.println(c + " " + b + " " + a);
		
		
	}

}