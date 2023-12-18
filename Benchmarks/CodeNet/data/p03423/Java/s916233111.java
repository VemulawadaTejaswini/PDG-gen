import java.io.*;
import java.util.*;

public class EasyMath {
	public static void main(String[] args) throws Exception
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String line = br.readLine();
		 StringTokenizer st = new StringTokenizer(line);
		 System.out.print((int)Math.floor(Integer.parseInt(st.nextToken())/3));
	}
}
