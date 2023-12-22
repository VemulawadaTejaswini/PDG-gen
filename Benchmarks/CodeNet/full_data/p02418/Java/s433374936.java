import java.util.Scanner;

// import java.util.ArrayList;
// import java.util.List;
// import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String p = scan.nextLine();
		char[] sC = s.toCharArray();
		char[] pC = p.toCharArray();
		for (int i = 0; i < sC.length; i++) {
			if (pC[0] == sC[i]) {
				int cnt = 0;
				for (int j = 0; j < p.length(); j++) {
					if(pC[j] == sC[(i + j) % s.length()]){
					cnt ++;
					}else{
					break;
					}
					if(p.length() == cnt){
					System.out.println("Yes");
					return;
					}
				}

			}
		}
		System.out.println("No");
	}

}

