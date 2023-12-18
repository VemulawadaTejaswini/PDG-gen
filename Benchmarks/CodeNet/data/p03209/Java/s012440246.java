import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int count = 0;

		String bergH[] = new String[N + 1];
		String berg = "";

		for(int i = 0; i<= N; i++) {
			if(i > 0) {
				bergH[i] = "b" + bergH[i -1] + "p" + bergH[i-1] + "b";
				berg = bergH[i];
			}else {
				bergH[i]= "p";
			}
		}
		System.out.println(berg);

		berg = berg.substring(berg.length() - X);

		for(int i = 0; i < berg.length();i++) {
			if(berg.substring(i,i+1).equals("p")) {
				count++;
			}
		}


		System.out.println(count);
	}

}
