import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		long x=in.nextLong(),y=in.nextLong();
		printBin(fillZero(Long.toBinaryString(x & y)));
		printBin(fillZero(Long.toBinaryString(x | y)));
		printBin(fillZero(Long.toBinaryString(x ^ y)));
	}
	
	static void printBin(String str) {
		for(int i=str.length()-32;i<str.length();i++)System.out.print(str.charAt(i));
		System.out.println();
	}
	
	static String fillZero(String str) {
		String zero="";
		if(str.length()<32) {
			for(int i=0;i<32-str.length();i++)zero+="0";
		}
		return zero.concat(str);
	}

}

