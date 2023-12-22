import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		double area = Double.valueOf(String.format("%5f", Math.pow(r, 2) * Math.PI));
		double circumference = Double.valueOf(String.format("%5f", (r * 2) * Math.PI));
		System.out.println(area + " " + circumference);
	}
}