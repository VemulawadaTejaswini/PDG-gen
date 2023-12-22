import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

//		while(true) {
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			int c = Integer.parseInt(line[2]);
			int count = 0;

			for(int i = a; i <= b; i++) {
				if(c % i == 0) {
				count++;
				}
			}
			System.out.println(count);
//		}
	}
}