import java.io.*;
class watch{
	 public static void main(String args[])throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String buf = br.readLine();
	int x = Integer.parseInt(buf);
	
	int y = x/360;
	int z = x/60;
	
	if(x > 59)
	x = 59;
	System.out.println(y + " " + z + " " + x);
	}
	}