import java.util.*;
public class Main 
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        int z = 0;
        boolean boo = false;
      int count = 0;
        for(int i = 0; i < a; i++)
        {
           if(a%i  == 0)
             boo = true;
          if(Math.pow(i+1, i)==a)
            count++;
             
        }
        System.out.println(count);
	}
}