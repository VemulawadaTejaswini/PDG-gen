import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int[] n = new int[3];
				for(int i=0; i<N; i++)
				{
					n[0] = sc.nextInt();
					n[1] = sc.nextInt();
					n[2] = sc.nextInt();
					Arrays.sort(n);
						if(n[2]*n[2] == n[0]*n[0] + n[1]*n[1])
						{
							System.out.println("YES");
						} else {
							System.out.println("NO");
						}
				}
		}
}