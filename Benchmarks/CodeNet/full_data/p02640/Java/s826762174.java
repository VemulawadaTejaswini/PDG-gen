import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a[] = new int[2];

		for (int i = 0; i < a.length; i++)
			a[i] = input.nextInt();

		if (a[0] * 4 < a[1]) {
			System.out.println("NO");
			return;
		}

		if(a[1]%2==0)
			System.out.println("YES");
		else 
			System.out.println("NO");
	
	}

}
