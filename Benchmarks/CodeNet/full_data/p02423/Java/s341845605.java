import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		String n;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.next();
			System.out.println(String.format("%32s", Long.toBinaryString(Long.parseLong(n))).replace(' ', '0'));
			System.out.println(String.format("%32s", Long.toBinaryString(~Long.parseLong(n))).substring(32));
			System.out.println(String.format("%33s", Long.toBinaryString(Long.parseLong(n)<<1)).replace(' ', '0').substring(1));
			System.out.println(String.format("%32s", Long.toBinaryString(Long.parseLong(n)>>>1)).replace(' ', '0'));
		}
	}
}
