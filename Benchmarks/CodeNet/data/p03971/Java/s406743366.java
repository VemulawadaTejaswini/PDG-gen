import java.util.Scanner;;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			String S = sc.next();
			findyes(S,N,A,B);
		}
	}
	public static void findyes(String S,int N,int A,int B)
	{
		int suma = 0;
		int sumb = 0;
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i) == 'a')
			{
				suma++;	
				if((suma+sumb) <= (A+B))
				{
					System.out.println("Yes");	
				}
				else
				{
					System.out.println("No");	
				}
			}
			else if(S.charAt(i) == 'b')
			{
				sumb++;
				if((suma+sumb) <= (A+B) && sumb <=B)
				{
					System.out.println("Yes");
				}
				else
				{
					sumb--;
					System.out.println("No");	
				}
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}