import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		int x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(br.readLine());
		if(x >= 30) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}

}