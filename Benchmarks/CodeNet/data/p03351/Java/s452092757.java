import java.util.*;

class myramaa {
	public static void main(String args[]) {
		Scanner Reader=new Scanner(System.in);
		int a=Reader.nextInt();
		int b=Reader.nextInt();
		int c=Reader.nextInt();
		int d=Reader.nextInt();
		if(Math.abs(a-c)<=d) {
			System.out.println("Yes");
		}
		else if(Math.abs(a-b)<=d && Math.abs(b-c)<=d) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}
