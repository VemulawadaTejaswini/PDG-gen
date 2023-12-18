import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		int height = sc.nextInt();
		for(int i=1;i<num;i++) {
			int me = sc.nextInt();
			if(height > me) {
				System.out.println(i);
				sc.close();
				return;
			}
			height = me;
		}
	}
}