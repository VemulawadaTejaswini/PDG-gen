import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.caesarCipherDecoder();
		return;
	}
	
	//入力された文字列をシーザー暗号から復号する
	private void caesarCipherDecoder() {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //標準入力
		
		try {
			String inputStr = bufferedReader.readLine();
			
			StringBuffer outputStr = new StringBuffer();
			for (int i = 0; i < inputStr.length(); i++) {
				char c = this.caesarCipherCharacterDecoder(inputStr.charAt(i));
				outputStr.append(c);
			}
			
			System.out.println(outputStr);
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}
	
	//アルファベット一文字をシーザー暗号から復号する
	private char caesarCipherCharacterDecoder(char c) {
		
		if (c == 'D') {
			c = 'A';
		} else if (c == 'E') {
			c = 'B';
		} else if (c == 'F') {
			c = 'C';
		} else if (c == 'G') {
			c = 'D';
		} else if (c == 'H') {
			c = 'E';
		} else if (c == 'I') {
			c = 'F';
		} else if (c == 'J') {
			c = 'G';
		} else if (c == 'K') {
			c = 'H';
		} else if (c == 'L') {
			c = 'I';
		} else if (c == 'M') {
			c = 'J';
		} else if (c == 'N') {
			c = 'K';
		} else if (c == 'O') {
			c = 'L';
		} else if (c == 'P') {
			c = 'M';
		} else if (c == 'Q') {
			c = 'N';
		} else if (c == 'R') {
			c = 'O';
		} else if (c == 'S') {
			c = 'P';
		} else if (c == 'T') {
			c = 'Q';
		} else if (c == 'U') {
			c = 'R';
		} else if (c == 'V') {
			c = 'S';
		} else if (c == 'W') {
			c = 'T';
		} else if (c == 'X') {
			c = 'U';
		} else if (c == 'Y') {
			c = 'V';
		} else if (c == 'Z') {
			c = 'W';
		} else if (c == 'A') {
			c = 'X';
		} else if (c == 'B') {
			c = 'Y';
		} else if (c == 'C') {
			c = 'Z';
		}
		
		return c;
	}
}