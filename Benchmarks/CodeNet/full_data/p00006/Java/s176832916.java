import java.io.*;

public class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = "";
		try {
			while((str = br.readLine()) != "") {
				for(int i=str.length(); i>0; i--) {
					sb.append(str.substring(i-1, i));
				}
				System.out.println(sb.toString());
			}
		} catch(Exception e) {
			e.getMessage();
		}
	}
}