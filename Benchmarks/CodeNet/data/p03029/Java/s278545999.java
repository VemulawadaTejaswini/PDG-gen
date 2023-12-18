import java.io.*;

public class ApplePie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 0;
		int piece_apple = 0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			String str = "";
			str = br.readLine();
			br.close();
			String strs[] = str.split(" ", 2);
			apple = Integer.parseInt(strs[0]);
			piece_apple = Integer.parseInt(strs[0]);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println((3 * apple + piece_apple) / 2);
	}

}