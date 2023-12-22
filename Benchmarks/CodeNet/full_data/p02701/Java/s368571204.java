import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		int count = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < N; i++) {
			String str = in.readLine();
			
			if (!map.containsKey(str)) {
				map.put(str, 1);
				count++;
			}
		}
		
		System.out.println(count);
	}
}
