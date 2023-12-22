import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int x = 0;
		StringBuilder str = new StringBuilder(16);



		for(int i = 1; i < 10000; i++){
			x = sc.nextInt();
			str.append("Case ");
			str.append(i);
			str.append(": ");
			str.append(x);

			if(x == 0){
			break;
			}
			System.out.println(str.toString());
			str.delete(0, str.length());
		}
	sc.close();
	}
}