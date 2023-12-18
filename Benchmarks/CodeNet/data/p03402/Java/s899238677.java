import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		StringBuilder sb = new StringBuilder();
		String ls = System.lineSeparator();
		int numA = 0;
		int numB = 0;
		int h = 0;
		int w = 100;
		while(numA<a-50) {
			sb.append(".#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#");
			sb.append(ls);
			sb.append("####################################################################################################");
			sb.append(ls);
			h += 2;
			numA += 50;
		}
		while(numA<a-1) {
			sb.append(".#");
			numA++;
		}
		while(numA%50!=0) {
			sb.append("##");
			numA++;
		}
		sb.append(ls);
		sb.append("####################################################################################################");
		sb.append(ls);
		sb.append("....................................................................................................");
		sb.append(ls);
		h += 3;
		
		while(numB<b-50) {
			sb.append(".#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#");
			sb.append(ls);
			sb.append("....................................................................................................");
			sb.append(ls);
			h += 2;
			numB += 50;
		}
		while(numB<b-1) {
			sb.append(".#");
			numB++;
		}
		while(numB%50!=0) {
			sb.append("..");
			numB++;
		}
		sb.append(ls);
		h++;
		
		System.out.println(h+" "+w);
		System.out.println(sb.toString());
		in.close();
	}

}
