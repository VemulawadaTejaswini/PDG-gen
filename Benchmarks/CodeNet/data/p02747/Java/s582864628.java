import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int flag = 0;
		for(int i=0;i<a.length();i++) {
			if(i%2==0) {
				if(a.charAt(i)!='h') {
					flag = 1;
					break;
				}
			}else {
				if(a.charAt(i)!='i') {
					flag = 1;
					break;
				}
			}
		}
		if(flag==1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
}