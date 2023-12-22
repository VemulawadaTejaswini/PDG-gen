import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		if(k==0)
		{
			System.out.println(n);
			System.exit(0);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<k;i++)
		{
			int a=in.nextInt();
			list.add(a);
		}
	 Collections.sort(list);
	 for(int i=(n-1);i>(-10);i++)
	 {
		 if(list.contains(i)!=true)
		 {
			 System.out.println(i);
			 System.exit(0);
		 }
	 }
	}
}