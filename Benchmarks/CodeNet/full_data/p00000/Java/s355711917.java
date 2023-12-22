import java.util.Scanner;
class sortingAlgorithm {
	public static void main(String args[])
	{
		Scanner scanInput = new Scanner(System.in);
		int[] input= new int[10];
		int temp;
		for(int x=0;x<10;x++)
			input[x]=scanInput.nextInt();
		scanInput.close();
		for(int x=0;x<input.length;x++)
		{
			for(int y=x;y<input.length;y++)
			{
				if(input[x]<input[y])
				{
					temp=input[x];
					input[x]=input[y];
					input[y]=temp;
				}
			}
		}
		for(int x=0;x<3;x++)
			System.out.println(input[x]);
	}
}