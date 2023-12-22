import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
    	int a = s.nextInt(), v = s.nextInt();
    	int b = s.nextInt(), w = s.nextInt();
    	int t = s.nextInt();
    	int speed = v - w;
    	if(a == b) {
    		System.out.println("YES");
//    		continue;
    	} else if(speed <= 0) {
    		System.out.println("NO");
    	} else {
    		double dist = Math.abs(b - a);
    		System.out.println(dist / speed <= t ? "YES" : "NO");
    	}
    }
}
