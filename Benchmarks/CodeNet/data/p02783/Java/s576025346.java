import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		if(n%k==0)
		{
			System.out.print(n/k);
		}
		else
		{
			System.out.println((n/k)+1);
		}

	}

}
