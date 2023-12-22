import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.nextLine();
			String[] t = str.split("[,. ]"); //区切った単語をすべて配列に入れなおす
			ArrayList<String> l = new ArrayList<>();
			for(String s: t) {              //区切ったできた単語を順にsに入れて扱う
				if(3<=s.length() && s.length()<=6) {
					l.add(s);
				}
			}
			String[] tt = l.toArray(new String[0]);
			System.out.println(String.join(" ", tt));
		}
	}

}


