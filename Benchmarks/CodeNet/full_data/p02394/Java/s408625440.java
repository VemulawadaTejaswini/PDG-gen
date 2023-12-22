import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = new String(in.readLine());
		String[] ss = s.split(" ");
		ArrayList<Integer> al = new ArrayList<Integer>();
		int W = Integer.parseInt(ss[0]);
		int H = Integer.parseInt(ss[1]);
		int x = Integer.parseInt(ss[2]);
		int y = Integer.parseInt(ss[3]);
		int r = Integer.parseInt(ss[4]);
		
		if(x - r < 0 || y - x < 0){
			System.out.println("Yes");
		}
		else if(x + r > W || y - x > H){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		System.out.println();
		
	}

}