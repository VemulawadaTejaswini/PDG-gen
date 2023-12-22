import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
	static char[][] key = new char[][] {{},{'\'',',','.','!','?'},{'a','b','c','A','B','C'},{'d','e','f','D','E','F'},
										{'g','h','i','G','H','I'},{'j','k','l','J','K','L'},{'m','n','o','M','N','O'},
										{'p','q','r','s','P','Q','R','S'},{'t','u','v','T','U','V'},{'w','x','y','z','W','X','Y','Z'}};
										
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String in = sc.next();
			int  id  = -1;
			int count = 0;
			
			for(int i = 0; i < in.length(); i++) {
				int a = in.charAt(i) - '0';
				if(a != id) {
					if(id != -1 && id != 0) {
						System.out.print(key[id][count]);
					}
					id = a;
					count = 0;
				}
				else if(a == id) {
					if(a == 0) System.out.print(' ');
					count++;
				}
			}
			if(id != -1 && id != 0) {
				System.out.print(key[id][count]);
			}
			System.out.println();
		}
	}
 }