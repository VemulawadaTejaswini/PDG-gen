import java.util.Scanner;

public class Main{
	int[] values;
	int size;
	public Main(int length)
	{
		values = new int[length];
		size = 0;
	}
	
	public void add(int i)
	{
		values[size] = i;
		size++;
	}
	
	public void print()
	{
		for(int i = 0; i < size; i++)
		{
			System.out.print("node " + (i + 1) + ": ");
			System.out.print("key = " + values[i] + ", ");
			if(i != 0)
			{
				System.out.print("parent key = " + values[(i - 1)/2] + ", ");
			}
			if((2 * i) + 1 < size)
			{
				System.out.print("left key = " + values[(2*i)+1] + ", ");
			}
			if((2 * i) + 2 < size)
			{
				System.out.print("right key = " + values[(2*i)+2] + ", ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		Main h = new Main(size);
		for(int i = 0; i < size; i++)
		{
			h.add(in.nextInt());
		}
		
		h.print();
	}
}













