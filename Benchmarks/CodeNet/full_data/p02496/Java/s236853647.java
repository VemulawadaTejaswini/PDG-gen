import java.io.*;
import java.util.*;

class Main {
	
	public void start() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		try {
			String str1 = input.readLine();
			int numbers  = Integer.parseInt(str1);
			while(n<numbers) {
				String str2 = input.readLine();
				String array[] = str2.split(" ");
				String card  = array[0];
				int number = Integer.parseInt(array[1]);
				nullnumber(card, number);
				n++;
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
		
	public void nullnumber(String x, int y) {
		int s[] = new int[13];
		int h[] = new int[13];
		int c[] = new int[13];
		int d[] = new int[13];
		
		if     (x == "S") { s[y-1] = y; }
		else if(x == "H") { h[y-1] = y; }
		else if(x == "C") { c[y-1] = y; }
		else if(x == "D") { d[y-1] = y; }
		
		for (int i=1; i<=13; i++) {
			if(s[i] == 0) {System.out.println("S "+ i); }
		}
		for (int i=1; i<=13; i++) {
			if(h[i] == 0) {System.out.println("H "+ i); }
		}
		for (int i=1; i<=13; i++) {
			if(c[i] == 0) {System.out.println("C "+ i); }
		}
		for (int i=1; i<=13; i++) {
			if(d[i] == 0) {System.out.println("D "+ i); }
		}
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}