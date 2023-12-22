import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		int i=0,x;
		while(true){
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String s = buf.readLine();
			x = Integer.parseInt(s);
			if(x == 0) break;
			i++;
			System.out.println("Case "+i+": "+x);
		}
	}

}