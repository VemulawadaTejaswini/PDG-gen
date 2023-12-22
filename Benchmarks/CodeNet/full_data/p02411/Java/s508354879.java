import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド
		Scanner sc = new Scanner(System.in);

		for(int i = 0;;i++) {
		int m = sc.nextInt();
		int f = sc.nextInt();
		int a = sc.nextInt();
		if(m==-1&&f==-1&&a==-1)
			break;
                if(m==-1||f==-1)
                        System.out.println("F");
		else if((m+f)>=80)
			System.out.println("A");
		else if((m + f)>=65)
			System.out.println("B");
		else if((m+f) >=50)
			System.out.println("C");
		else if((m+f)>=30&&a>=50)
			System.out.println("C");
		else if((m+f)>=30)
			System.out.println("D");
		else
			System.out.println("F");
		}
	}
}

