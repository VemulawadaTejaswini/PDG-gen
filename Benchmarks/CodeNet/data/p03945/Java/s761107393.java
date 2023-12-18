import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(i-1))count++;
		}
		System.out.println(count);
	}

}