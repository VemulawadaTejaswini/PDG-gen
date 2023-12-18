
import java.util.Scanner;
public class Main {


public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	float x;
	int jpn=0;
	float btc=0;
	for(int i=0;i<n;i++) {
		x=sc.nextFloat();
		String s = sc.nextLine();
		if(s.contains("JPY")) {
			jpn += x;
		}else {
			btc += x;
		}

	}
	sc.close();
	System.out.println(btc*380000 + jpn);
}

}
