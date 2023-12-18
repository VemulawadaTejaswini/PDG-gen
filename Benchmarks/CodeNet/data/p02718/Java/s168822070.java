import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
     	 Scanner sc = new Scanner(System.in);
      	
     	String[] sep = sc.nextLine().split(" ");
      	int n = Integer.parseInt(sep[0]);
      	int m = Integer.parseInt(sep[1]);
      	int[] bigger = new int[m];
      	String[] sepa = sc.nextLine().split(" ");
      	int sumVote = 0;
      	for(int i = 0; i < n; i++)
        {
         	int num =  Integer.parseInt(sepa[i]);
          	sumVote += num;
          	boolean judge = true;
          	for(int j = 0; j < m && judge; j++)
            {
              	if(num > bigger[j])
                {
                 	 judge = false;
                  	for(int k = j; k < m - 1; k++)
                    {
                     	 bigger[k + 1] = bigger[k];
                    }
                  	bigger[j] = num;
                }
            }
          
          	
        }
      	boolean judge = true;
      	for(int i = 0; i < m && judge; i++)
        {
          if(bigger[m - 1] < sumVote / (4 * m))
          {
            	judge = false;
          }
        }
      
      if(judge)
      {
        	System.out.print("Yes");
      }else{
        	System.out.print("No");
      }
    }
}