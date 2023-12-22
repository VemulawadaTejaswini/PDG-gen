import java.io.*;

public class Main{
 public static void main(String[] args){
  int a,b;
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  try{
String line = reader.readLine();
a = Integer.parseInt(line);
line = reader.readLine();
b = Integer.parseInt(line);
System.out.println((a * b)+" "+(2*a+2*b)\n);

  } catch (IOException e) {
				System.out.println(e);
			} catch (NumberFormatException e) {
				System.out.println(e);
		}
 }
}