import java.util.*;

public class Main {
	static int countSubStr(String str, int len, int k)  
    {  
        int count = 0;  
      
        for (int i = 0; i < len; i++)  
        {  
            int n = 0;  
                  for (int j = i; j < len; j++) 
            {  
                n = n * 10 + (str.charAt(j) - '0');  
                      if (n % k == 0)  
                    count++;  
            }  
        }  
      
        return count;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        count = countSubStr(s, s.length(),2019);
        System.out.println(count);
    }
}