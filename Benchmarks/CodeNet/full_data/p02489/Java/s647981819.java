import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {

		int i=1;
		for(;;) {
			BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
			String str = input.readLine();
			int x=Integer.valueOf(str);
			if(x == 0) {break;}
			System.out.println("Case "+ i + ": " + x);
			i++;
		}
	}

}