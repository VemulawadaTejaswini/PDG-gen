package collection;
import java.util.*;
public class greateroftwo {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want");
		int A = sc.nextInt();
		int B = sc.nextInt();
      	int C = sc.nextInt();
      if(C%7==0 && C<B&& C>A )
      {
        System.out.println("OK")
      }
      else
      {
        System.out.println("NG")
      }
          
          