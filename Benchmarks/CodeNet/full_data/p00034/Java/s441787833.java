import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		while((s=br.readLine())!=null && !s.isEmpty())
		{
			int[] l = new int[10];
			int[] v = new int[2];
			int temp = 0;
			for (int i = 0; i < 10; i++) {
				l[i] = Integer.parseInt(s.split(",")[i]) + temp;
				temp = l[i];
			}
			for (int i = 10; i < 12; i++) {
				v[i-10] = Integer.parseInt(s.split(",")[i]);
			}
			System.out.println(calc(l,v));
		}
	}
	private static int calc(int[] l, int[] v)
	{
		double sum_l=l[9];
		double intersection;
		
		intersection = sum_l/(v[0]+v[1]) * v[0];
		int cnt=0;
		while(l[cnt]<intersection) {cnt++;}
		return cnt+1;
	}
}