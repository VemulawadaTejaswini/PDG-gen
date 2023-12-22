import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			long a = sc.nextLong();
			long b = sc.nextLong();
			String and = Long.toBinaryString(a & b);
			String or = Long.toBinaryString(a | b);  //左シフト
			String xor = Long.toBinaryString(a ^ b);  //右シフト
			and = to32(and);
			or = to32(or);
			xor = to32(xor);
			System.out.println(and + '\n' + or+ '\n' + xor);
		}
	}


	//桁数を32にする
	static String to32(String s) {
		int a = 32-s.length();
		if (a != 0)	for (int i=0; i<a; i++)	s = '0' + s;
		if (a < 0) s = s.substring(s.length()-32);
		return s;
	}
}
