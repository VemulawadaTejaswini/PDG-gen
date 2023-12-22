import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			String s = sc.nextLine();
			if (s == "0")
				break;
			for (int i = 0; i < s.length(); i++) {
				char keta = s.charAt(i);
				switch (s) {
				case "0":sum += 0;
						 break;
				case "1":sum += 1;
						 break;
				case "2":sum += 2;
						 break;
				case "3":sum += 3;
						 break;
				case "4":sum += 4;
						 break;
				case "5":sum += 5;
						 break;
				case "6":sum += 6;
						 break;
				case "7":sum += 7;
					 	 break;
				case "8":sum += 8;
					 	 break;
				case "9":sum += 9;
						 break;
				}
			}
			System.out.println(sum);
		}
	}
}