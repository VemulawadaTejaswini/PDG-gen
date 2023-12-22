import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true) {
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			if(a == 0 && b == 0) 
				break;

			if(a <= b) {
				System.out.println(a + " " + b);
			} else {
				System.out.println(b + " " + a);
			}
		}
	}
}