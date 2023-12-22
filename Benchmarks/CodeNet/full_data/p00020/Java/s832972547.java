import java.io.*;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		//Scanner scan = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String str = br.readLine();
        System.out.println(str.toUpperCase());
	}
}