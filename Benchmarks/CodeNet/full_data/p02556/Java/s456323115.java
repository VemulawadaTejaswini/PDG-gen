import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] al=new int[n];
		int[] al1=new int[n];
		int max,max1=0;		
		for(int i=0;i<n;i++)
		{
			al[i]=sc.nextInt();
			al1[i]=sc.nextInt();
			
		}
		for(int i=0;i<n-1;i++)
		{
			max=(Math.abs(al[i]-al[i+1])+Math.abs(al1[i]-al1[i+1]));
			max1=Math.max(max, max1);
		}
		System.out.println(max1);
	}

}
