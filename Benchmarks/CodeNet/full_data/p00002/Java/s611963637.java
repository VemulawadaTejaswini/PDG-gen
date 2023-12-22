import java.util.Scanner;

class Main{
	public static void main(String[] a){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		char[] c = input.toCharArray();
			
		int count = 0;
			
		for (int i = 0; i < c.length; i++) {
			int num = Character.getNumericValue(c[i]);
			if (i < c.length && num > 0) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}