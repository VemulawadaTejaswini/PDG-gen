import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力

		String s = null;
		switch(sc.next()){
			case "A":
				s="T";
				break;
			case "C":
				s="G";
				break;
			case "G":
				s="C";
				break;
			case "T":
				s="A";
				break;
		}

		// 出力
		System.out.println(s);
	}
}