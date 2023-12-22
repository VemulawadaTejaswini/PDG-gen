import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext())
			{
				long a = sc.nextInt();
				long b = sc.nextInt();
				long d = a * b; 
				long r;
					for(;;)
					{
						r = a % b;if(r==0){System.out.println(b +" "+ d/b);break;}
						a = b % r;if(a==0){System.out.println(r +" "+ d/r);break;}
						b = r % a;if(b==0){System.out.println(a +" "+ d/a);break;}
					}
			}
	}
}