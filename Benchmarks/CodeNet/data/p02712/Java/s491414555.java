import java.util.Scanner;
public class Main
{
  	public static void main(String[] args)
    {
     	Scanner sc = new Scanner(System.in);
      	long a = sc.nextLong();
      	
      	long result = a * (a + 1) / 2;
      	long san = 3 * (a / 3) * (a / 3 + 1) / 2;
      	long go = 5 * (a / 5) * (a / 5 + 1) / 2;
      	long juugo = 15 * (a / 15) * (a / 15 + 1) / 2;
      	
      	System.out.println(result - san - go + juugo);
    }
}