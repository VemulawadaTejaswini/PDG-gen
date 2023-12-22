import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		sb.append(n).append(":");

		int i=2;
		while (true) {
			if (n%i == 0) {
				sb.append(" ").append(i);
				n = n/i;
				if (n == 1)
					break;
			}else {
				i++;
			}
		}

		System.out.println(sb);

		br.close();
	}
}