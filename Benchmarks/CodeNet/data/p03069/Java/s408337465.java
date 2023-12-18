import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		String s = scanner.next();
			System.out.println(reccount(s,0));
			scanner.close();
	}

	private static int reccount(String s,int i) {
		if(s.equals(s.replaceFirst("#.","##"))) {
			return i;
		}
		String temp = s.replaceFirst("#.","##");
		i++;

		return reccount(temp, i);
	}

}