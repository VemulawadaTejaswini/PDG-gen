import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
     	 Scanner sc = new Scanner(System.in);
      	
     	String[] sep = sc.nextLine().split(" ");
      	int n = Integer.parseInt(sep[0]);
      	int k = Integer.parseInt(sep[1]);
      	
      	int min = n % k;
      	if(min > (k - min))
        {
         	System.out.println(k - min); 
        }else{
         	System.out.println(min); 
        }
    }
}