import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
//class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader stdReader =
            new BufferedReader(new InputStreamReader(System.in));
        String line = stdReader.readLine();
        
        int a = Integer.parseInt(line);
        
        System.out.println( (a / 3600) + ":" + ( (a / 60) % 60 ) +":" + (a % 60) );
	}
}