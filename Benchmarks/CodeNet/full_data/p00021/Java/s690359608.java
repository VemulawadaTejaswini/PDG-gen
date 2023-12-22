import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			double x1 = stdIn.nextDouble();
			double y1 = stdIn.nextDouble();
			double x2 = stdIn.nextDouble();
			double y2 = stdIn.nextDouble();
			double x3 = stdIn.nextDouble();
			double y3 = stdIn.nextDouble();
			double x4 = stdIn.nextDouble();
			double y4 = stdIn.nextDouble();
			double cross = Math.abs((x2 - x1)*(y4 - y3) - (x4 - x3)*(y2 - y1));
			
			
			if(cross < 1e-10) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
	}
}