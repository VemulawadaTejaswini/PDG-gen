import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		str = br.readLine().split(" ");
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			int a = Integer.parseInt(str[i]);
			if(b.isEmpty() || a != b.get(b.size() - 1)) b.add(a);
		}
		for(int i = 0; i < b.size(); i++){
			System.out.print(b.get(i));
			if(i != b.size() - 1) System.out.print(" ");
		}
		System.out.print("\n");
	}
}

