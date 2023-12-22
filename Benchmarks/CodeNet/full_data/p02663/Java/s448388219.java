import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		LocalDateTime date1 = LocalDateTime.of(2020,5,30,h1,m1,00);
		LocalDateTime date2 = LocalDateTime.of(2020,5,30,h2,m2,00);

		LocalDateTime date1_1 = date1.plusMinutes(k);

		DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("HH:mm");
		String sDate1_1 = date1_1.format(dtFormat);
		String sDate2 = date2.format(dtFormat);

		String[] array1 = sDate1_1.split(":");
		String[] array2 = sDate2.split(":");

		int ans = (Integer.parseInt(array2[0])-Integer.parseInt(array1[0]))*60;
		ans = ans + Integer.parseInt(array2[1])-Integer.parseInt(array1[1]);
		System.out.println(ans);

	}
}
