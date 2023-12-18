import java.util.Arrays;
import java.util.Scanner;

// C

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();

		int[] a = new int[26]; // 出現回数格納用の配列
		int[] b = new int[26]; // 出現回数格納用の配列

		Arrays.fill(a, 0);
		Arrays.fill(b, 0);

		// 文字数違うなら終わり
		if(line1.length() != line2.length()){
			System.out.println("No");
			return;
		}


		for(int i = 0; i < line1.length(); i++){
			char ch = line1.charAt(i);
			if(ch == 'a'){
				a[0]++;
			}
			else if(ch == 'b'){
				a[1]++;
			}
			else if(ch == 'c'){
				a[2]++;
			}
			else if(ch == 'd'){
				a[3]++;
			}
			else if(ch == 'e'){
				a[4]++;
			}
			else if(ch == 'f'){
				a[5]++;
			}
			else if(ch == 'g'){
				a[6]++;
			}
			else if(ch == 'h'){
				a[7]++;
			}
			else if(ch == 'i'){
				a[8]++;
			}
			else if(ch == 'j'){
				a[9]++;
			}
			else if(ch == 'k'){
				a[10]++;
			}
			else if(ch == 'l'){
				a[11]++;
			}
			else if(ch == 'm'){
				a[12]++;
			}
			else if(ch == 'n'){
				a[13]++;
			}
			else if(ch == 'o'){
				a[14]++;
			}
			else if(ch == 'p'){
				a[15]++;
			}
			else if(ch == 'q'){
				a[16]++;
			}
			else if(ch == 'r'){
				a[17]++;
			}
			else if(ch == 's'){
				a[18]++;
			}
			else if(ch == 't'){
				a[19]++;
			}
			else if(ch == 'u'){
				a[20]++;
			}
			else if(ch == 'v'){
				a[21]++;
			}
			else if(ch == 'w'){
				a[22]++;
			}
			else if(ch == 'x'){
				a[23]++;
			}
			else if(ch == 'y'){
				a[24]++;
			}
			else if(ch == 'z'){
				a[25]++;
			}
		}

		for(int i = 0; i < line2.length(); i++){
			char ch = line2.charAt(i);
			if(ch == 'a'){
				b[0]++;
			}
			else if(ch == 'b'){
				b[1]++;
			}
			else if(ch == 'c'){
				b[2]++;
			}
			else if(ch == 'd'){
				b[3]++;
			}
			else if(ch == 'e'){
				b[4]++;
			}
			else if(ch == 'f'){
				b[5]++;
			}
			else if(ch == 'g'){
				b[6]++;
			}
			else if(ch == 'h'){
				b[7]++;
			}
			else if(ch == 'i'){
				b[8]++;
			}
			else if(ch == 'j'){
				b[9]++;
			}
			else if(ch == 'k'){
				b[10]++;
			}
			else if(ch == 'l'){
				b[11]++;
			}
			else if(ch == 'm'){
				b[12]++;
			}
			else if(ch == 'n'){
				b[13]++;
			}
			else if(ch == 'o'){
				b[14]++;
			}
			else if(ch == 'p'){
				b[15]++;
			}
			else if(ch == 'q'){
				b[16]++;
			}
			else if(ch == 'r'){
				b[17]++;
			}
			else if(ch == 's'){
				b[18]++;
			}
			else if(ch == 't'){
				b[19]++;
			}
			else if(ch == 'u'){
				b[20]++;
			}
			else if(ch == 'v'){
				b[21]++;
			}
			else if(ch == 'w'){
				b[22]++;
			}
			else if(ch == 'x'){
				b[23]++;
			}
			else if(ch == 'y'){
				b[24]++;
			}
			else if(ch == 'z'){
				b[25]++;
			}
		}

		// 昇順にソート
		Arrays.sort(a);
		Arrays.sort(b);
		String ans = "";

		for(int i=0; i < 26; i++){
			if(a[i] != b[i]){
				ans = "No";
				break;
			}
			if(i == 25){
				ans = "Yes";
			}
		}

			System.out.println(ans);
	}
}