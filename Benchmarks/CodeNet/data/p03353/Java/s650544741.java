import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s = br.readLine();
		int k = Integer.parseInt(br.readLine());

		List<String> hl = new ArrayList<>();

		for(int i = 0,len=s.length(); i < len; i++){
			for(int j = i+1; j < len+1; j++){
				hl.add(s.substring(i,j));
			}
		}
		Collections.sort(hl);
		List<String> list = new ArrayList<String>(new LinkedHashSet<>(hl));
		System.out.println(list.get(k-1));
	}
}