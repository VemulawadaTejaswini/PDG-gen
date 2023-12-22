import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
        String[] strs = str.split(" ");
		//--- list内表示 ---
		for(int i = strs.length-1; i >= 0; i--){
			System.out.print(strs[i] + " ");
		}//for
	}
}