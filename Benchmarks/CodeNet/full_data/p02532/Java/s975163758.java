import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int Mt = sc.nextInt();
			char[][] block = new char[Mt][1000];
			int[] Mt_Height = new int[Mt];
		for(;;)
		{
			String cmd = sc.next();
			
				if(cmd.equals("push"))
				{
					int p = sc.nextInt();
						block[p-1][Mt_Height[p-1]] = sc.next().charAt(0);
						Mt_Height[p-1]++;
				}
				if(cmd.equals("pop"))
				{
					int p = sc.nextInt();
						Mt_Height[p-1]--;
						System.out.println(block[p-1][Mt_Height[p-1]]);
				}
				if(cmd.equals("move"))
				{
					int p1 = sc.nextInt();
					int p2 = sc.nextInt();
						Mt_Height[p1-1]--;
						block[p2-1][Mt_Height[p2-1]] = block[p1-1][Mt_Height[p1-1]];
						Mt_Height[p2-1]++;
				}
				if(cmd.equals("quit"))
				{
					break;
				}
		}
	}
}