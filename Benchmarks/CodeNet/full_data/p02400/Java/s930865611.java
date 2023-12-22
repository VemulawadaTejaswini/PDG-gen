import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Integer r = Integer.parseInt(bufferedReader.readLine());
		Double aDouble  = 2 * Math.PI * r;
		Double bDouble = Math.pow(r, 2) * Math.PI;
		
		System.out.println(aDouble + " " + bDouble);
	}
}