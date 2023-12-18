import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int SX = input.nextInt();
		int SY = input.nextInt();
		int EX = input.nextInt();
		int EY = input.nextInt();
		int disX = Math.abs(EX-SX);
		int disY = Math.abs(EY-SY);
		for (int i = 0; i < disX; i++) {
			System.out.print("R");
		}
		for (int i = 0; i < disY; i++) {
			System.out.print("U");
		}
		for (int i = 0; i < disX; i++) {
			System.out.print("L");
		}
		for (int i = 0; i <= disY; i++) {
			System.out.print("D");
		}
		for (int i = 0; i <= disX; i++) {
			System.out.print("R");
		}
		for (int i = 0; i <= disY; i++) {
			System.out.print("U");
		}
		System.out.print("L");
		System.out.print("U");
		for (int i = 0; i <= disX; i++) {
			System.out.print("L");
		}
		for (int i = 0; i <= disY; i++) {
			System.out.print("D");
		}
		System.out.print("R");
	}
}