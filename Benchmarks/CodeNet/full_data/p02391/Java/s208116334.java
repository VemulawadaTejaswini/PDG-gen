import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main
{
    public static void main(String[] args) throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line =br.readLine(); 
	String[] f = line.split(" ");
	int a=Integer.parseInt(f[0]);
	int b=Integer.parseInt(f[1]);
	if (a < b) 
	    System.out.println("a < b");
	else if (a > b) 
	    System.out.println("a > b");
	else
	    System.out.println("a == b");
    }

}