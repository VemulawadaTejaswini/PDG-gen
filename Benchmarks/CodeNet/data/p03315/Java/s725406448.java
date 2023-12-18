import java.util.Scanner;


public class EatingSymblsEasy {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		String S=scanner.next();

		int kotae=0;

		for(int i=0;i<4;i++) {
			if(S.substring(i,i+1).equals("+")) {//Stringは参照型。文字の中身の比較をするのは.equals
				kotae++;
			}else {
				kotae--;
			}

		}System.out.println(kotae);
	}
}