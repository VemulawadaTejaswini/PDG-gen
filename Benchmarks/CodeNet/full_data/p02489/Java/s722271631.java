import java.io.*;

public class Q10006 {
	public static void main(String[] args) throws IOException {
		int i=0,x;
		while(true){
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

			String s = buf.readLine();
			String[] st = s.split(" ");

			x = Integer.parseInt(st[i]);
			if(x == 0) break;
			i++;
			System.out.println("Case "+i+": "+x);
		}
	}

}