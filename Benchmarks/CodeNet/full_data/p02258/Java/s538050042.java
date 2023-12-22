import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int mnv = input.nextInt();
		int mxv, t;
		t = input.nextInt();
		mxv = t - mnv;
		if(t < mnv)
			mnv = t;	
		for(int i = 2; i < n; i++)
		{
			t = input.nextInt();
			if(t < mnv)
				mnv = t;
			else if(mxv < t - mnv)
				mxv	= t - mnv;
		}
		System.out.println(mxv);
	}
}