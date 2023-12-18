import java.io.*;
import java.util.Arrays;
public class Main
{

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			char c[] = line.toCharArray();
			char d[] = line.toCharArray();
			int count = 0;
			for(int i=0;i<line.length()-1;i++) {
				for(int k = i+1;k<line.length();k++) {
					char temp = d[i];
					d[i] = d[k];
					d[k] = temp;
					
					if(!Arrays.equals(c, d)) {
						count++;
						d = line.toCharArray();
					}
				}
			}
			System.out.println(count+1);
			
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
