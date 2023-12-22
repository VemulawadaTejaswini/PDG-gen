import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args)throws IOException
	{
//		n?????????
//		b, f, r, v????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> build = new ArrayList<Integer>();
		ArrayList<Integer> floor = new ArrayList<Integer>();
		ArrayList<Integer> room = new ArrayList<Integer>();
		ArrayList<Integer> v = new ArrayList<Integer>();

		String[] buf = new String[4];
		for(int i=1; i<=num; i++)
		{
			buf = br.readLine().split(" ");
			build.add(Integer.parseInt(buf[0]));
			floor.add(Integer.parseInt(buf[1]));
			room.add(Integer.parseInt(buf[2]));
			v.add(Integer.parseInt(buf[3]));
		}
		int[][] b1 = new int[3][10], b2 = new int[3][10], b3 = new int[3][10], b4 = new int[3][10];
//		4?£????????????????????????°?§????????????????
		for(int i=0; i<num; i++)
		{
			switch(build.get(i))
			{
			case 1:
				b1[floor.get(i)][room.get(i)] = v.get(i);
				break;
			case 2:
				b2[floor.get(i)][room.get(i)] = v.get(i);
				break;
			case 3:
				b3[floor.get(i)][room.get(i)] = v.get(i);
				break;
			case 4:
				b4[floor.get(i)][room.get(i)] = v.get(i);
				break;
			}
		}

		for(int i=0; i<b1.length; i++)
		{
			for(int j=0; j<b1[0].length; j++)
			{
				System.out.print(b1[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");

		for(int i=0; i<b2.length; i++)
		{
			for(int j=0; j<b2[0].length; j++)
			{
				System.out.print(b2[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");

		for(int i=0; i<b3.length; i++)
		{
			for(int j=0; j<b3[0].length; j++)
			{
				System.out.print(b3[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");

		for(int i=0; i<b4.length; i++)
		{
			for(int j=0; j<b4[0].length; j++)
			{
				System.out.print(b4[i][j]);
			}
			System.out.println();
		}

	}
}