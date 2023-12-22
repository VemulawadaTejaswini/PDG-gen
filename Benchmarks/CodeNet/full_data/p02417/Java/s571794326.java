import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int [] count = new int[26];
			for (int i=0; i<26; i++) count[i] = 0; //初期化
			String eng = "";
			while (sc.hasNext()) {
				eng += sc.nextLine();
			}
			count = Count(eng,count);
			Output(count);
		}
	}

	static int[] Count(String s, int[] c) {
		for (int i=0; i<s.length(); i++) {
			int a = s.charAt(i);
			if ((a>=65) && (a<=90)) {
				int b = 26- (90-a)-1;
				c[b]++;
			}
			else if ((a>=97) && (a<=122)) {
				int b = 26-(122-a)-1;
				c[b]++;
			}
		}
		return c;
	}

	static void Output(int[] c) {
		for (int i=0; i<26; i++) {
			int a = i + 97;
			System.out.print(Character.toChars(a));
			System.out.println(" : " + c[i]);
		}
	}
}

