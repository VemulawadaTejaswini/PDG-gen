
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		
		int x=Integer.parseInt(str);
		int i=1;
		while (1) { 
			if(x == 0) {break;}
				System.out.println("Case "+ i + ": " + str);
				i++;
		}
		
	}

}