import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Ecount=0;
		int oC=0;
		int t=N;
		while (t-- > 0) {
			int n=sc.nextInt();
			if(n%4==0)
				Ecount++;
			else if(n%2==0)
				oC++;
		}
		if(Ecount>=N/2||(Ecount+oC>(N/2)&&oC%2==0))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
