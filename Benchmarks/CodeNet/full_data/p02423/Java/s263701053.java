import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		long x=in.nextLong();
		printBin(fillZero(Long.toBinaryString(x)));
		printBin(fillZero(Long.toBinaryString(~x)));
		printBin(fillZero(Long.toBinaryString(x<<1)));
		printBin(fillZero(Long.toBinaryString(x>>1)));
	}
	
	static void printBin(String str) {
		//System.out.println(str);
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

