import java.util.*;
import java.io.*;

class main {

    public static void main (String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			
			if (line.length() <= 20 && line.length() > 0) {
				char[] str = line.toCharArray();
				for (int i = str.length-1; i >= 0; i--) {
					System.out.print(str[i]);
				}
			}else{
				System.exit(1);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
				
    }
}