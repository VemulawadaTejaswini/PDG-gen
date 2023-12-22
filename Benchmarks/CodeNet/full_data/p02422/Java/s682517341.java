import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder ans = new StringBuilder();
		sb.append(br.readLine());
		int num = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < num ; i++){
			String s[] = br.readLine().split(" ");
			if(s[0].equals("print")){
				ans.append(sb.substring(Integer.parseInt(s[1]), Integer.parseInt(s[2])+1)).append("\n");

			}else if(s[0].equals("reverse")){
				StringBuilder sb2 = new StringBuilder(sb.substring
						(Integer.parseInt(s[1]), Integer.parseInt(s[2])+1));
				sb.replace(Integer.parseInt(s[1]), Integer.parseInt(s[2])+1,sb2.reverse().toString());
			}else{
				sb.replace(Integer.parseInt(s[1]), Integer.parseInt(s[2])+1,s[3]);
			}
		}
		System.out.println(ans);
	}
}