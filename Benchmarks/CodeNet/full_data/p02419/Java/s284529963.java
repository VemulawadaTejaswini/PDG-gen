import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tar = sc.next().toLowerCase();
		int count = 0;
		while(true) {
			String tmp = sc.next();
			if(tmp.equals("END_OF_TEXT")) break;
			if(tar.equals(tmp.toLowerCase())) {
				count++;
			}
		}
		System.out.println(count);
	}
}