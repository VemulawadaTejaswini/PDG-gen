
import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		int d = c++;



// splitで分割して格納
String[] strArray = b.split("");
//指定された番号の文字列
String x = strArray[d];

for (int i = 0; i < strArray.length; i++) {

	if(x != strArray[i]) {
		strArray[i] = "*";
	}

}
}
}