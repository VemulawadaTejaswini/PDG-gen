    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int n = scan.nextInt();
			int[] a = new int[n];
			//int[] b = new int[n];
			int sum=0;
			for(int i=0;i<n;i++)
			{
				a[i]=scan.nextInt();
				sum=sum+a[i];
			}
			int abc=0;
			for(int i=0;i<n;i++)
			{
				abc=abc+a[i]*(sum-a[i]);
			}
			System.out.println(abc/2);
    	}
    }