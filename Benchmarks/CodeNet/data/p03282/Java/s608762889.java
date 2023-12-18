import java.util.Scanner;

class Main{
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		String s = stdIn.next();
		long k = stdIn.nextLong();
		
		String[] split = s.split("");
		
		if (!(split[0].equals("1"))) {
			System.out.println(split[0]);
			return;
		}
		
		for (int i = 0; i < split.length; i++) {
			if (split[i].equals("1")) {
				continue;
			}
			System.out.println(split[i]);
			return;
		}
		
		System.out.println("1");
		
	}
}