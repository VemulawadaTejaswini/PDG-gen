public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			long a,b,s,p=0;
			a=sc.nextInt();
			b=sc.nextInt();
			s=a+b;
			while(s>0)
			{
				p++;
				s/=10;
			}
			System.out.println(p);
		}
		

	}

}