import java.util.Scanner;
public class Main
{
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        int c = sc.nextInt();
      
        int r1[] = new int[a];
        int r2[] = new int[b];
      
        for( int i = 1; i < a; i++)
        {
          r1 = sc.nextInt();
        }
       
        for( int i = 1; i < b; i++ )
        {
          r2 = sc.nextInt();
        }
      
        int read = 0;
        int read1 = 0;
        int read2 = 0;
      
        for(int i = 1; i <= c; i++)
        {
          if(r1 < r2)
          {
            read = 1;
          }
          else
          {
            read1 = 1;
          }
        }
    }