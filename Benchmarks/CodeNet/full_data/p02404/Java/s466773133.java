import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		String[] strs;
		int  height, width;
		do {
			sb		= new StringBuilder();
			strs	= br.readLine().split("\\s+");
			height	= Integer.parseInt(strs[0]);
			width	= Integer.parseInt(strs[1]);
			
			if (height == 0 && width == 0) {
				break;
			} else {
				System.out.println(getFrame(height, width));
			}
		} while (true);
	}
	
	public static String getFrame(int height, int width) {
		StringBuilder sb = new StringBuilder();
		String str;
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == (height - 1) || j == 0 || j == (width - 1)) {
					str = "#";
				} else {
					str = ".";
				}
				sb.append(str);
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
}