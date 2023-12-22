import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = reader.readLine();
			String[] str1 = line.split(" ", -1);
			int n = Integer.parseInt(str1[0]);
			int r = Integer.parseInt(str1[1]);
			if(n == 0 && r == 0){
				break;
			}
			int area = 0;
			int length = 0;
			for(int i = 0; i < n; i++){
				String lines = reader.readLine();
				String[] str = lines.split(" ", -1);
				int x1 = Integer.parseInt(str[0]);
				int y1 = Integer.parseInt(str[1]);
				int x2 = Integer.parseInt(str[2]);
				int y2 = Integer.parseInt(str[3]);
				area += (x2 - x1) * (y2 - y1);
				if(r == 2){
					length += ((x2 - x1) + (y2 - y1)) * 2;
				}
			}
			System.out.println(area);
			if(r == 2){
				System.out.println(length);
			}
		}
	}
}