public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; ++i)
		{
			int a = stdIn.nextInt();
			list.add(a);
		}
		Collections.sort(list);
		for(int i = 9; i > 6; --i)
		{
			System.out.println(list.get(i));
		}
	}
}