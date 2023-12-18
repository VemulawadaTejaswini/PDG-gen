import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str=sc.nextLine();
			int sum=0;
			int num=0;
			for(int i=0; i<str.length(); i++) {
				num=str.charAt(i)-'0';
				sum+=num;
			}
			int s=Integer.valueOf(str);
			if(s%sum==0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
			
		}
	}
}

