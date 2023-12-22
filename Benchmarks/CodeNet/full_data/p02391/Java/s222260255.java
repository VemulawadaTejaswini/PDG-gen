import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strs = str.split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		if(a == b){
			System.out.println("a == b");
		}else if(a < b){
			System.out.println("a < b");
		}else{
			System.out.println("a > b");
		}//if
		br.close();
	}
}