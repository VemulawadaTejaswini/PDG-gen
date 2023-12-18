
import java.io.*;

public class main {
  public static void main ( String[ ] args ) {
	  int a,b,x,y,z;
	  System.out.print("a = ");
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
try{
	String buf = br.readLine();
	a = Integer.parseInt(buf);
	System.out.print("b = ");
	buf = br.readLine();
	b = Integer.parseInt(buf);
}catch(Exception e){
	a = 0;
	b = 0;
}
   x = a + b;
   y = a - b;
   z = a * b;
   
int values[] = {x, y, z};
int max      = values[0];
for (int index = 1; index < values.length; index ++) {
	 max = Math.max(max, values[index]);
     }
	  System.out.println ( max );
  }
}
