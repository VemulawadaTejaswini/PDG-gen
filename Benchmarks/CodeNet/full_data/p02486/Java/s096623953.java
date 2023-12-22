import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		try {
			while(br.ready()){
				buf = br.readLine();
				Scanner scanner = new Scanner(buf);
				int n = Integer.parseInt(scanner.next());
				int x = Integer.parseInt(scanner.next());
				if(n == 0 && x == 0){
					return;
				}
				int count = 0;
				int i, k;
				for(i = n; i > n/3; i--){
					for(k = i - 1; k > (x-i)/2; k--){
						if(i + k < x){
							count++;
						}
					}
				}
				System.out.println(count);
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
}