import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String temp = br.readLine();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n ; i++){
			if(temp.contains(br.readLine()))out.println(1);
			else out.println(0);
		}
		out.flush();

	}
}