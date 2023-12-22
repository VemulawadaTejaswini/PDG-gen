import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String T=sc.nextLine();
			String P=sc.nextLine();
			int num=0;
			for(int i=0; i<T.length(); i=i+P.length()) {
				if(T.indexOf(P, i)!=-1) {
					System.out.println(T.indexOf(P, i));
				}
			}

		}
	}
}
