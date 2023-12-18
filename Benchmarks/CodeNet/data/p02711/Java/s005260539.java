import java.util.Scanner;
public class Main
{
  	public static void main(String[] args)
    {
     	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	boolean jud = false;
      	while(!jud && a > 1)
        {
         	if(a % 10 == 7)
            {
             	jud = true; 
            }
          
          	a /= 10;
        }
      
      	if(jud)
        {
          	System.out.println("Yes");
        }else{
          	System.out.println("No");
        }
    }
}