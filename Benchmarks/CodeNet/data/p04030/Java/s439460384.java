import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		StringBuffer A = new StringBuffer(a);
		int count = a.length();
		for(int i = 1; i <= count; i++) {
			if(a.substring(i-1, i).equals("B")){
				int num = i-2;
				A.delete(i-2, i);
			}

		}
	System.out.println(A);
	}
}