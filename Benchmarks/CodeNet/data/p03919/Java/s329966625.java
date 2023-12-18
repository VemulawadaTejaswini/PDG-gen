import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] S = new String[h][w];
		int[] num = new int[h];
		String[] alf = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				S[i][j] = sc.next();
			}
		}
		for(int i = 0 ; i < h ; i++) num[i] = i + 1;
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				if(S[i][j].equals("snuke")) {
					System.out.print(alf[j]);
					System.out.println(num[i]);
				}
			}
		}
	}
}