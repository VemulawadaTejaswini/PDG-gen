import java.util.*;
public class Main
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		    int i = 1;
		    int x = 1;
            while(x == 0){
            	int a = scanner.nextInt();
            	x = a;
            	System.out.println("Case " + i +": "+ x);
            	i ++;
            } 
    }
}