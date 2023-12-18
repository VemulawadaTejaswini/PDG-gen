import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = System.out;
    	PrintWriter out = new PrintWriter(outputStream);

        int i, n, m, c, k;

		int t = Integer.parseInt(br.readLine());    
        String str = br.readLine();
	
      	if(t<3200)
          	System.out.print("red");
     	else
          	System.out.print(str);
          	
	out.flush();
	out.close();
	
	}
}