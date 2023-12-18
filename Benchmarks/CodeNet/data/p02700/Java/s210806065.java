import java.util.Scanner;
public class Main 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int A  = sc.nextInt();  
        int B  = sc.nextInt();  
        int C  = sc.nextInt();  
        int D  = sc.nextInt(); 
        
        for(;;)
        {
        if(A <= C)
        {
          System.out.println("No");
          break;
        }
        
        if(B <= D)
       	{
          System.out.println("Yes");
          break;
       	}
        }
}

}
