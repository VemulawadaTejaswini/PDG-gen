import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int len = sc.nextInt();
			String s = sc.next();
			int pointer = 0;
			int count = 0;
			while (pointer < len-1) {
				if (!s.substring(pointer,pointer+1).equals(s.substring(pointer+1,pointer+2))) {
					count++;
					pointer += 2;  //次の
				}
				else pointer++;
			}
			System.out.println(count);
		}
	}
}

