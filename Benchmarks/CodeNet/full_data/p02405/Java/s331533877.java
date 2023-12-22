import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] tmp = br.readLine().split(" ");
			long h = Long.parseLong(tmp[0]);
			long w = Long.parseLong(tmp[1]);
			tmp = null;
			if (h == 0 && w == 0)
				break;
			else
				write(h, w);
		}
	}

	private static void write(long h, long w) {
		String[] charTable = { "#", "." };
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < w;i++){
			sb.append(charTable[i % 2]);
		}
		sb.append(String.format("%n"));
		String even = sb.toString();
		sb.delete(0, sb.length());
		
		for(int i = 0;i < w;i++){
			sb.append(charTable[(i+1) % 2]);
		}
		sb.append(String.format("%n"));
		String odd = sb.toString();
		sb.delete(0, sb.length());
		
		String[] lineTable = {even, odd};
		for(int i = 0;i < h;i++){
			sb.append(lineTable[i % 2]);
		}
		
		System.out.println(sb.toString());
		sb = null;
	}

}