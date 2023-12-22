import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);

			if((a - b) == 0){
				System.out.println("a == b");
			}
			if((a - b) > 0){
				System.out.println("a > b");
			}
			if((a - b) < 0){
				System.out.println("a < b");
			}
	}
}