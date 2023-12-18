import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next(),t="";
		int countOdd=0,countEven=0;
		for(int i=0;i<s.length();i++) {
			if(!s.substring(i, i+1).equals(t.substring(i, i+1)))countOdd++;
		}
		System.out.println(countOdd);
	}
}

