
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		int[][] alpha = new int[N][26];
		int min = 51;
		String[] s = new String[N];
		for(int i = 0; i < N; i++) {
			s[i] = scan.nextLine();
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < s[i].length(); j++) {
				if(s[i].substring(j, j + 1).equals("a")) {
					alpha[i][0]++;
				} else if(s[i].substring(j, j + 1).equals("b")) {
					alpha[i][1]++;
				} else if(s[i].substring(j, j + 1).equals("c")) {
					alpha[i][2]++;
				} else if(s[i].substring(j, j + 1).equals("d")) {
					alpha[i][3]++;
				} else if(s[i].substring(j, j + 1).equals("e")) {
					alpha[i][4]++;
				} else if(s[i].substring(j, j + 1).equals("f")) {
					alpha[i][5]++;
				} else if(s[i].substring(j, j + 1).equals("g")) {
					alpha[i][6]++;
				} else if(s[i].substring(j, j + 1).equals("h")) {
					alpha[i][7]++;
				} else if(s[i].substring(j, j + 1).equals("i")) {
					alpha[i][8]++;
				} else if(s[i].substring(j, j + 1).equals("j")) {
					alpha[i][9]++;
				} else if(s[i].substring(j, j + 1).equals("k")) {
					alpha[i][10]++;
				} else if(s[i].substring(j, j + 1).equals("l")) {
					alpha[i][11]++;
				} else if(s[i].substring(j, j + 1).equals("m")) {
					alpha[i][12]++;
				} else if(s[i].substring(j, j + 1).equals("n")) {
					alpha[i][13]++;
				} else if(s[i].substring(j, j + 1).equals("o")) {
					alpha[i][14]++;
				} else if(s[i].substring(j, j + 1).equals("p")) {
					alpha[i][15]++;
				} else if(s[i].substring(j, j + 1).equals("q")) {
					alpha[i][16]++;
				} else if(s[i].substring(j, j + 1).equals("r")) {
					alpha[i][17]++;
				} else if(s[i].substring(j, j + 1).equals("s")) {
					alpha[i][18]++;
				} else if(s[i].substring(j, j + 1).equals("t")) {
					alpha[i][19]++;
				} else if(s[i].substring(j, j + 1).equals("u")) {
					alpha[i][20]++;
				} else if(s[i].substring(j, j + 1).equals("v")) {
					alpha[i][21]++;
				} else if(s[i].substring(j, j + 1).equals("w")) {
					alpha[i][22]++;
				} else if(s[i].substring(j, j + 1).equals("x")) {
					alpha[i][23]++;
				} else if(s[i].substring(j, j + 1).equals("y")) {
					alpha[i][24]++;
				} else if(s[i].substring(j, j + 1).equals("z")) {
					alpha[i][25]++;
				}
			}
		}
		
		for(int i = 0; i < alpha[0].length; i++) {
			for(int j = 0; j < N; j++) {
				if(alpha[j][i] < min) {
					min = alpha[j][i];
				}
			}
			for(int j = 0; j < min; j++) {
				if(i == 0) {
					System.out.print("a");
				} else if(i == 1) {
					System.out.print("b");
				} else if(i == 2) {
					System.out.print("c");
				} else if(i == 3) {
					System.out.print("d");
				} else if(i == 4) {
					System.out.print("e");
				} else if(i == 5) {
					System.out.print("f");
				} else if(i == 6) {
					System.out.print("g");
				} else if(i == 7) {
					System.out.print("h");
				} else if(i == 8) {
					System.out.print("i");
				} else if(i == 9) {
					System.out.print("j");
				} else if(i == 10) {
					System.out.print("k");
				} else if(i == 11) {
					System.out.print("l");
				} else if(i == 12) {
					System.out.print("m");
				} else if(i == 13) {
					System.out.print("n");
				} else if(i == 14) {
					System.out.print("o");
				} else if(i == 15) {
					System.out.print("p");
				} else if(i == 16) {
					System.out.print("q");
				} else if(i == 17) {
					System.out.print("r");
				} else if(i == 18) {
					System.out.print("s");
				} else if(i == 19) {
					System.out.print("t");
				} else if(i == 20) {
					System.out.print("u");
				} else if(i == 21) {
					System.out.print("v");
				} else if(i == 22) {
					System.out.print("w");
				} else if(i == 23) {
					System.out.print("x");
				} else if(i == 24) {
					System.out.print("y");
				} else if(i == 25) {
					System.out.print("z");
				}
			}
			min = 51;
		}
		scan.close();

	}

}
