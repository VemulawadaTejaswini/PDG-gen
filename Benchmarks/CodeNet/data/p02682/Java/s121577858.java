import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		sc.close();
		while(k!=0) {
			if (a!=0) {
				k-=1; a--; count++; //value of a card is 1
			} else if (b!=0) {
				k-=1; b--; //value of b card is 0
			} else if (c!=0) {
				k-=1; c--;count--; //value of c card is -1
			}
		}
		System.out.println(count);
	}
}
