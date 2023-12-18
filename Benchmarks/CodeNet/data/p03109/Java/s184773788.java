import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] sdate = s.split("/",0);
		int[] date = new int[3];
		for(int i = 0;i < 3;i ++) {
			date[i] = Integer.parseInt(sdate[i]);
		}
		if(date[0] <= 2019 && date[1] <= 4 && date[2] <= 30) {
			System.out.println("Heisei");
		}else {
			System.out.println("TBD");
		}
	}
}