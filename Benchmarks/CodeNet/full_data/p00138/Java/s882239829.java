import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{ new Main().Solve(); }
	

	
	public void Solve()
	{
		Scanner sc=new Scanner(System.in);
		Player[] finalist =new Player[6];
		Player[] candidate=new Player[18];
		
		for(int i=0; i<3; i++)
		{
			Player[] p=new Player[8];
			for(int j=0; j<8; j++)
				p[j] = new Player(sc.nextInt(), sc.nextDouble());

			Arrays.sort(p);
			finalist[i*2  ]=p[0];
			finalist[i*2+1]=p[1];
			
			for(int j=0; j<6; j++)
				candidate[i*6+j]=p[j+2];
		}
		for(int i=0; i<6; i++)
			System.out.println(finalist[i]);

		Arrays.sort(candidate);
		for(int i=0; i<2; i++)
			System.out.println(candidate[i]);
	}

	class Player implements Comparable<Player>
	{
		private int    no;
		private double time;
		
		public Player(int no, double time)
		{ this.no=no; this.time=time; }
		
		public String toString()
		{ return String.format("%d %.2f", no, time); }
		
		public int compareTo(Player p)
		{
			if(this.time > p.time)return 1;
			if(this.time < p.time)return -1;
			return 0;
		}
	}
}