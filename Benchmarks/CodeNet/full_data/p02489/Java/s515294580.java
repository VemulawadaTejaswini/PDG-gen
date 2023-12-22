import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		int i=0,x;

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		String s = buf.readLine();
		String[] st = s.split(" ");

		while(true){
			x = Integer.parseInt(st[i]);
			if(x == 0) break;
			i++;
			System.out.println("Case "+i+": "+x);
		}
	}

}