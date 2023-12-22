import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = System.out;
		int m, f, r;
		while(true){
			String[] score = in.readLine().split(" ");
			m = Integer.parseInt(score[0]);
			f = Integer.parseInt(score[1]);
			r = Integer.parseInt(score[2]);
			if(m==-1 && f==-1 && r==-1){
				break;
			}
			if(m==-1 || f==-1){
				out.println("F");
			}else if(m+f >= 80){
				out.println("A");
			}else if(m+f >= 65){
				out.println("B");
			}else if(m+f >= 50 || r>=50){
				out.println("C");
			}else if(m+f >= 30){
				out.println("D");
			}else {
				out.println("F");
			}
		}
	}
}