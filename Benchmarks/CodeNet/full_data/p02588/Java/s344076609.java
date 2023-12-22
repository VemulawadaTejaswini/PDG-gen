import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int t=input.nextInt(),count=0;;
		double[] arr=new double[t];
		double sum=1;
		for(int i=0;i<t;i++)
		{
			arr[i]=input.nextDouble();
		}
		
		for(int i=0;i<arr.length;i++ )
		{
			for(int j=1+i;j<arr.length;j++)
			{
				sum= (arr[i]*arr[j]);
				if(((int)sum==sum) && i<j)
					count++;
				
			}
			
		}
		System.out.println(count);
	}

}
