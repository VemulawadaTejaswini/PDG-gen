import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String a = s.replace("apple", "peach");
		String b = s.replace("peach", "apple");

		String result = "";
		for(int i = 0; i < a.length(); i++){


			if(a.charAt(i) == b.charAt(i)){
				result += a.charAt(i);

			}else if(a.charAt(i) == s.charAt(i)){
				result += b.charAt(i);

			}else{
				result += a.charAt(i);
			}



		}
		System.out.println(result);
    }
}