import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		String N = scanner.nextLine();
		String H = scanner.nextLine();

		ArrayList<Integer> cntList = new ArrayList<Integer>();

		String[] line = H.split(" ");

		int cnt = 0;
		int j ;

		for(int i = 0;i<line.length-1;i++) {
			j=i;
			cnt = 0;
			while (i<line.length-1) {
				if(Integer.parseInt(line[i])>=Integer.parseInt(line[i+1])) {
					i=i+1;
					cnt=cnt+1;
				}else {
					i=j;
					break;
				}
			}
			cntList.add(cnt);
		}


		System.out.println(Collections.max(cntList));

	}

}
