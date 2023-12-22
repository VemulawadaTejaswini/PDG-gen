import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		for(int i = 1; !(str.equals("0")); i++){
			str = br.readLine();
			System.out.println("Case " + i + ": " + str);
		}//for
		br.close();
	}
}