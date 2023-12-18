import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String t;
		if(s=="Sunny") {
			t="Cloudy";
		}else if(s=="Cloudy") {
			t="Rainy";
		}else {
			t="Sunny";
		}
		System.out.print(t);
	}
}
