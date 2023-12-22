import java.util.*;

public class Main{
public static void main(String[] args)
	{	Scanner sc = new Scanner(System.in);
     	int k = sc.nextInt();
     
     	int ans = 0;
     StringBuilder s = new StringBuilder();
     	while(true)
        {
          s.append("7");
          int num = mod(s.toString(),k);
          if(num%k==0)
          {
            ans = s.length();
            break;
          }
          if(s.length()==Integer.MAX_VALUE)
          {
              ans = -1;
              break;
          }
   
        }
     	

     
  
     	System.out.println(ans);
  
		}
		 static int mod(String num, int a) 
    { 
          
          
        int res = 0; 
  
        for (int i = 0; i < num.length(); i++) 
            res = (res * 10 + (int)num.charAt(i) 
                                     - '0') % a; 
  
        return res; 
    } 
}