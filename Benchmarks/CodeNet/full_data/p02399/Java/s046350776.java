import java.io.*;
public class Main {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
        	String[] num = line.split(" ", -1);
        	int a = Integer.parseInt(num[0]);
        	int b = Integer.parseInt(num[1]);
        	
        	int d = a / b;
        	int r = a % b;
        	float f = a / b;
        	
        	System.out.println(d + " " + r + " " + f);
        } catch (IOException e) {
          System.out.println(e);
        } catch (NumberFormatException e) {
          System.out.println("error");
        }
    }
}