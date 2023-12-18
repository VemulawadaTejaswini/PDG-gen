import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		 
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int i=0;
		int p;
		while(true) {
			if(c==0) {
				break;
			}else {
				p=b-a;
				if(p<0) break;
				i++;
				while(p>=a && c>i) {
					p=p-a;
					i++;
				}
				break;
			}
		}
	System.out.println(i);
	}
}
