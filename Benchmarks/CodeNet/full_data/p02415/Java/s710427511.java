import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String s;
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		scan.close();
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]>=65&&c[i]<=90){
				c[i]+=32;
			}
			else if(c[i]>=97&&c[i]<=122){
				c[i]-=32;
			}
			System.out.print(c[i]);
		}
		System.out.println();
	}
}
