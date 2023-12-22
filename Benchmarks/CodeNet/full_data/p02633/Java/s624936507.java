import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws Exception{
		
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(ob.readLine()); 

		int X = Integer.parseInt(ob.readLine());
		int count = 0;

		for(int i = X; i <= 360; i += X){
			count++;
		}
		System.out.println(count);
	}
}