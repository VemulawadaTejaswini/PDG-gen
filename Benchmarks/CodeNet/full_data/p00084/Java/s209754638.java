import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			String str=sc.nextLine();
			String[] t=str.split(" ");
			int count =0;
			for(int i=0; i<t.length; i++) {
				if(t[i].charAt(t[i].length()-1)==',') {
					t[i]=t[i].substring(0, t[i].length()-1);
				}
				else if(t[i].charAt(t[i].length()-1)=='.') {
					t[i]=t[i].substring(0, t[i].length()-1);
				}
				if(t[i].length()>2 && t[i].length()<7) {
					count++;
					if(count == 1) {
						System.out.printf("%s", t[i]);
					}
					else {
						System.out.printf(" %s", t[i]);
					}
				}
			}
			System.out.println();
		}
	}
}

