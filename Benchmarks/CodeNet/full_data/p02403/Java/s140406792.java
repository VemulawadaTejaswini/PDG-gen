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
			if(h == 0 && w == 0)break;
			else write(h, w);
		}
	}
	
	private static void write(long h, long w){
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < w;i++){
			sb.append("#");
		}
		sb.append(String.format("%n"));
		String line = sb.toString();
		sb.delete(0, sb.length());
		for(int i = 0;i < h;i++){
			sb.append(line);
		}
		System.out.println(sb.toString());
	}
}