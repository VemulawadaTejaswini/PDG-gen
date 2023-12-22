import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] strArray = str.split("", 0);

		for(int i = strArray.length - 1; i > -1; i--) {
			if(i == 0) {
				System.out.println(strArray[0]);
			} else {
				System.out.print(strArray[i]);
			}
		}

	}
}