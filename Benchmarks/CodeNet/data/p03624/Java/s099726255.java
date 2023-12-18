import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		/*
		Character[] alp = new Character[26];
		char c ='a';
		for(int i=0;i<26;i++) {
			alp[i]=c;
			c++;
		}*/
		//StringBuilder alpSB = new StringBuilder();
		String alp = "abcdefghijklmnopqrstuvwxyz";
		//alpSB.append(alp);
		String hyozi ="";
		for(int i=0;i<alp.length();i++) {
			//aから順に調べて、ｓ内に存在するか
				if(s.contains(String.valueOf(alp.charAt(i)))) {
				}else {
					hyozi=String.valueOf(alp.charAt(i));
					break;
			}
		}
		if(hyozi.equals("")) {
			System.out.println("None");
		}else {
			System.out.println(hyozi);
		}

	}

}
