import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		String str3 = str1 + str1;
		
		if(str3.contains(str2)){
			System.out.println("YES");
		} else {
			System.out.println("No");
		}
	}
}