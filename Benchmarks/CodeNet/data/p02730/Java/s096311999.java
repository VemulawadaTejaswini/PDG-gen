import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String S = null ;
		S=cin.nextLine();
		char [] a = S.toCharArray();
		int n=0;
		int i=0,j=a.length-1;
		while(i<j)
		{
			if(a[i]==a[j])
			{
				n=1;
			}
			i++;
			j--;
		}
		if(n==1)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
