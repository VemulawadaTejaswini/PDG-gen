import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String input = br.readLine();
		String[] item = input.split(" ");
		for(int i = item.length; i >= 1; i--){
			System.out.print(item[i-1] + " ");
		}
		System.out.print("\n");

	}
}