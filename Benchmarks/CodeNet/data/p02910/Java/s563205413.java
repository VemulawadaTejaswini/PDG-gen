import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean f=true;
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				if(s.charAt(i)=='L')
					f=false;
			}else {
				if(s.charAt(i)=='R')
					f=false;
			}
		}
		if(f)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}