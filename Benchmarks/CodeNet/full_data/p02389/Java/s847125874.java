
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args){
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	try {
		String line = reader.readLine();
		int a = Integer.parseInt(line);
		String line2 = reader.readLine();
		int b = Integer.parseInt(line2);
		int x,y;
		x=a*2+b*2;
		y=a*b;
		System.out.println(+ x + " " + y);
	}catch (IOException e) { 
		System.out.println(e);
	} catch (NumberFormatException e) { 
		System.out.println("error\n");
	}
	
}

}