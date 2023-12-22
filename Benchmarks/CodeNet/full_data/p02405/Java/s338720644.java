import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		do {
			sb = new StringBuilder();
			
			String[] strs = br.readLine().split("\\s+");
			int height	= Integer.parseInt(strs[0]);
			int width	= Integer.parseInt(strs[1]);
			
			if (height == 0 && width == 0) break;
			
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					if (isOdd(i) && isOdd(j))	sb.append("#");
					if (isOdd(i) && !isOdd(j))	sb.append(".");
					if (!isOdd(i) && isOdd(j))	sb.append(".");
					if (!isOdd(i) && !isOdd(j))	sb.append("#");
				}
				sb.append("\n");
			}
			
			System.out.println(sb);
		} while (true);
	}
	
	public static boolean isOdd(int i) {
		return i % 2 == 0 ? false : true;
	}
}