import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		ArrayList<Integer> data = new ArrayList<>();
		String str = br.readLine();
		String L[] = str.split(" ",0);
		for(int i = 0; i < 2*N; i++){
			data.add(Integer.parseInt(L[i]));
		}
		Collections.sort(data);
		for(int i = 0; i < 2*N; i= i+2){
			result += data.get(i);
		}
		System.out.println(result);
	
	}
}