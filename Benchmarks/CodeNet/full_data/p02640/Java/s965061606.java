import java.util.Scanner;

public class Crane_and_Turtle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a[] = new int[2];

		for (int i = 0; i < a.length; i++)
			a[i] = input.nextInt();

		if (a[0] * 4 < a[1]) {
			System.out.println("NO");
			return;
		}

		for(int i=a[0]-1;i>0;i--)
			a[1]-=4;
		
		System.out.println(a[1]);
		if(a[1]==0||a[1]==2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	
	}

}
