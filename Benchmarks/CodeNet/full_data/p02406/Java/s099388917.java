import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String datas = br.readLine();
		int n = Integer.parseInt(datas);
		
		for(int i = 3;i<=n;i++) {
			
			if(i % 3 ==0 || i % 10 ==3) {
				sb.append(" ").append(i);
			}
		
		}
		System.out.println(sb);
	}
}