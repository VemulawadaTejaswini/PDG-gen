import java.util.Scanner;
public class Main
{
 	public static void main(String[] args)
    {
     	Scanner sc = new Scanner(System.in);
      	String[] sep = sc.nextLine().split("");
      	boolean judge = true;
      	for(int i = 0; i < (sep.length - 1) / 2; i++)
        {
         	if(!sep[i].equals(sep[((sep.length + 3) / 2) - 1 + i])) 
            {
             	judge = false; 
            }
        }
      	if(judge)
        {
          	System.out.println("Yes");
        }else{
          	System.out.println("No");
        }
    }
  
}