import java.util.Scanner;
public class A{

public static void main(String args[])
{
	int s = new Scanner(System.in);
	int a = s.nextInt();
	int[] b = new int[a];
	for(int i = 0;i < a;i++) {
		b[i] = s.nextInt();

	}
	for(int i = 0;i < a;i++) {
		int v = b[i];

		System.out.println("");
		int j = i-1;
		while(j >= 0 && b[j] > v) {
			b[j+1] = b[j];
			j--;
			b[j+1] = v;
		}
		for(int c = 0;c < a;c++)
		{
			System.out.print(b[c]);
		}
		}

	}
}

