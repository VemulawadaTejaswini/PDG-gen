import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				String str = br.readLine();

				int[] count = new int[26];
				for(int i=0; i < str.length(); i++) {

					if(str.charAt(i) == 'a' ||str.charAt(i) == 'A') {
						count[0]++;
					}else if(str.charAt(i) == 'b' ||str.charAt(i) == 'B') {
						count[1]++;
					}else if(str.charAt(i) == 'c' ||str.charAt(i) == 'C') {
						count[2]++;
					}else if(str.charAt(i) == 'd' ||str.charAt(i) == 'D') {
						count[3]++;
					}else if(str.charAt(i) == 'e' ||str.charAt(i) == 'E') {
						count[4]++;
					}else if(str.charAt(i) == 'f' ||str.charAt(i) == 'F') {
						count[5]++;
					}else if(str.charAt(i) == 'g' ||str.charAt(i) == 'G') {
						count[6]++;
					}else if(str.charAt(i) == 'h' ||str.charAt(i) == 'H') {
						count[7]++;
					}else if(str.charAt(i) == 'i' ||str.charAt(i) == 'I') {
						count[8]++;
					}else if(str.charAt(i) == 'j' ||str.charAt(i) == 'J') {
						count[9]++;
					}else if(str.charAt(i) == 'k' ||str.charAt(i) == 'K') {
						count[10]++;
					}else if(str.charAt(i) == 'l' ||str.charAt(i) == 'L') {
						count[11]++;
					}else if(str.charAt(i) == 'm' ||str.charAt(i) == 'M') {
						count[12]++;
					}else if(str.charAt(i) == 'n' ||str.charAt(i) == 'N') {
						count[13]++;
					}else if(str.charAt(i) == 'o' ||str.charAt(i) == 'O') {
						count[14]++;
					}else if(str.charAt(i) == 'p' ||str.charAt(i) == 'P') {
						count[15]++;
					}else if(str.charAt(i) == 'q' ||str.charAt(i) == 'R') {
						count[16]++;
					}else if(str.charAt(i) == 'r' ||str.charAt(i) == 'S') {
						count[17]++;
					}else if(str.charAt(i) == 's' ||str.charAt(i) == 'T') {
						count[18]++;
					}else if(str.charAt(i) == 't' ||str.charAt(i) == 'U') {
						count[19]++;
					}else if(str.charAt(i) == 'u' ||str.charAt(i) == 'V') {
						count[20]++;
					}else if(str.charAt(i) == 'v' ||str.charAt(i) == 'W') {
						count[21]++;
					}else if(str.charAt(i) == 'w' ||str.charAt(i) == 'X') {
						count[22]++;
					}else if(str.charAt(i) == 'x' ||str.charAt(i) == 'Y') {
						count[23]++;
					}else if(str.charAt(i) == 'y' ||str.charAt(i) == 'Z') {
						count[24]++;
					}else if(str.charAt(i) == 'z' ||str.charAt(i) == 'A') {
						count[25]++;
					}
				}

				String str2 = "abcdefghijklmnopqrstuvwxyz";
				for(int j=0; j<26; j++) {
				System.out.println(str2.charAt(j)+":"+count[j]);
				}

			}catch(IOException e) {
				System.out.println("Exception : " + e);
			}
		}

	}

