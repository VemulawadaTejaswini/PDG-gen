import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strs = str.split(" ");
		int W = Integer.parseInt(strs[0]);
		int H = Integer.parseInt(strs[1]);
		int x = Integer.parseInt(strs[2]);
		int y = Integer.parseInt(strs[3]);
		int r = Integer.parseInt(strs[4]);
		if(W > x && H > x){
			if(W > y && H > y){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
		}//if
		br.close();
	}
}