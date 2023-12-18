import java.io.*;
import java.util.*;

public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dist = sc.nextInt();
		int i = 1;
		int loc = 0;
		int seconds = 0;
		while(loc!= dist) {
			if( (loc + i) + (i+1) <= dist || loc + i == dist )
			{
				loc += i;
				i++;
				seconds++;
			}
			else {
				i++;
				seconds++;
			}
		}
		System.out.println(seconds);
	}
}