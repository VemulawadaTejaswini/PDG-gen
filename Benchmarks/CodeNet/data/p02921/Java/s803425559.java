import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		String s=src.next();
		String s2=src.next();
		int equal=0;
		for(int i=0;i<3;i++) {
			if(s.charAt(i)==s2.charAt(i))
				equal++;
		}
		System.out.print(equal);

	}

}