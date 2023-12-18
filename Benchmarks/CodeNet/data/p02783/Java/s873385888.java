import java.util.*;
public class Main
{
  	public static void main(String args[])
    {
      	Scanner sc = new Scanner(System.in);
      	int t = sc.nextInt();
      	int n = sc.nextInt();
      	if(t % n==0)
          	System.out.println(t/n);
     	else
          	System.out.println((t/n) + 1);
    }
}