import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		String[] i = s.nextLine().split(" ");
		int i1 = Integer.parseInt(i[0]);
		int i2 =  Integer.parseInt(i[1]);
		int dec = i2-i1;
		int y = 0;
		for(int j =1;j<dec;j++){
			y = y+j;
		}
		System.out.println(y-i1);
	}
}