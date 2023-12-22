import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			String str = (br.readline()).split(" ");
			if (str[1] == "?") {
				break;
			}
			String con = str[0] + str[1] + str[2];
			int a = Integer.parseInt(con);
			sb.append(con).append("\n");
		}
		System.out.print(sb);
	}
}