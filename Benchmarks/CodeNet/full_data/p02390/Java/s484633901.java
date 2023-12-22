package step1;

public class Main {

	public static void main(String[] args) {

		int S = 46979;

		int hour = S/3600;
		int minute = (S-hour*3600)/60;
		int second = (S-hour*3600-minute*60);
		System.out.println(hour+" "+minute+" "+second);

	}

}

