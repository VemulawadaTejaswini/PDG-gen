import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine().toLowerCase();
		int count = 0;
		
		end:
		while (scanner.hasNext()) {
			String str = scanner.nextLine().toLowerCase();
			String[] strs = str.split(" ");
			for (int i = 0; i < strs.length; i++) {
				if(strs[i].equals("end_of_text")){
					break end;
				}
				if (strs[i].equals(ans)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}