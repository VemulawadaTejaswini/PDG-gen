import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static String a;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			Vertex[] list = new Vertex[4];
			String[] tmp = stdIn.nextLine().split(",");
			
			for(int i = 0; i < 4; i++) {
				list[i] = new Vertex(Double.parseDouble(tmp[i * 2]),Double.parseDouble(tmp[i*2+1]));
			}
			ArrayList<Double> al = new ArrayList<Double>();
			for(int i = 0; i < 5; i++) {
				Vertex a = list[i%4];
				Vertex b = list[(i+1)%4];
				
				double x = b.x - a.x;
				double y = b.y - a.y;
				al.add(Math.abs(Math.atan2(y, x)));
			}
			Collections.sort(al);
			double tmpx = al.get(0);
			int count = 0;
			for(int i = 1; i < 5; i++) {
				if(tmpx != al.get(i)) {
					count++;
				}
				tmpx = al.get(i);
			}
			System.out.println((count==2)?"YES":"NO");
			
		}
	}
	
	static class Vertex {
		Double x;
		Double y;
		Vertex(Double x, Double y) {
			this.x = x;
			this.y = y;
		}
	}
	
}