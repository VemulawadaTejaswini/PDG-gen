import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int k = stdIn.nextInt();

		int cnt = 12;
		long i = 13;

		if(k<=12) {
			System.out.println(k);
			return;
		}

		String a = "";
		while(cnt!=k) {
			a = String.valueOf(i);
			if(a.contains("19")||a.contains("91")||a.contains("18")||a.contains("81")||a.contains("17")|| a.contains("71")||a.contains("16")
					||a.contains("61")||a.contains("15")||a.contains("51")||a.contains("14")||a.contains("41")|| a.contains("13")||
					a.contains("31") || a.contains("29")|| a.contains("92")||a.contains("28")||a.contains("82")||a.contains("27")||a.contains("72")
					||a.contains("26")||a.contains("62") || a.contains("25")|| a.contains("52")||a.contains("24")||a.contains("42")||
					a.contains("20")||a.contains("02") || a.contains("39")||a.contains("93")||a.contains("38")||a.contains("83")||a.contains("37")|| a.contains("73")||
					a.contains("36")||a.contains("63")||a.contains("35")||a.contains("53")||a.contains("31")||a.contains("13")||a.contains("30")||a.contains("03")||
					a.contains("49")||a.contains("94")||a.contains("48")||a.contains("84")||a.contains("47")||a.contains("74")||a.contains("46")||a.contains("64")||
					a.contains("42")||a.contains("24")||a.contains("41")||a.contains("40")||a.contains("04")||a.contains("59")||a.contains("95")||a.contains("58")||a.contains("85")||
					a.contains("57")||a.contains("75")||a.contains("50")||a.contains("05")||a.contains("69")||a.contains("96")||a.contains("68")||a.contains("86")||
					a.contains("60")||a.contains("06")||a.contains("79")||a.contains("97")||a.contains("70")||a.contains("07")||a.contains("80")||a.contains("08")||a.contains("90")||a.contains("09")) {

			}else {
				cnt++;
			}




			i++;
		}

System.out.println(i-1);


	}

}
