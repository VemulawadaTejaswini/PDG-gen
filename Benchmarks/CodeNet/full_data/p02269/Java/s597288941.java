import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static final int M = 1046527;
	public static String[] dictionary = new String[M];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<String> answers = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String[] meirei = sc.nextLine().split(" ");
			if(meirei[0].equals("insert")) {
				insert(meirei[1]);
			} else {
				answers.add(search(meirei[1]));
			}
		}
		for(String answer: answers) {
			System.out.println(answer);
		}
	}
	public static int h1(int key) {
		return key % M;
	}
	public static int h2(int key) {
		return 1 + (key % (M - 1));
	}
	public static int h(int key, int i) {
		return (h1(key) + i * h2(key)) % M;
	}
	public static int insert(String t) {
		int i = 0;
		int key = getKey(t);
		while(true) {
			int j = h(key, i);
			if(dictionary[j] == null) {
				dictionary[j] = t;
				return j;
			} else {
				i++;
			}
		}
	}
	public static String search(String t) {
		int i = 0;
		int key = getKey(t);
		while(true) {
			int j = h(key, i);
			if(dictionary[j] == null || i >= M) {
				return "no";
			} else if(dictionary[j].equals(t)) {
				return "yes";
			} else {
				i++;
			}
		}
	}
	public static int getInt(char c) {
		switch (c) {
		case 'A':
			return 1;

		case 'C':
			return 2;

		case 'G':
			return 3;

		case 'T':
			return 4;

		default:
			return 0;
		}
	}
	public static int getKey(String moziretsu) {
		int sum = 0;
		int p = 1;
		char[] c = moziretsu.toCharArray();
		for(int i = 0; i < c.length; i++) {
			sum += p * (getInt(c[i]));
			p *= 5;
		}
		return sum;
	}
}