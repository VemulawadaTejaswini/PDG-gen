import java.util.*;

public class Main{
    
    static boolean hash[] =new boolean[10000001];
	public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      fill();
		int n=sc.nextInt();
      	long sum=0;
      
      for(int i=1;i<=n;i++)
      {
        sum += i*divCount(i);
      }
      
      
      System.out.println(sum);
    }
  
  static void fill()
  { int n=10000001;
    Arrays.fill(hash, true); 
    for (int p = 2; p * p < n; p++) 
        if (hash[p] == true) 
            for (int i = p * 2; i < n; i += p) 
                hash[i] = false; 
  
  }
  
  static int divCount(int n) 
{ 
   
   
 
    int total = 1; 
    for (int p = 2; p <= n; p++)  
    { 
        if (hash[p]) 
        { 
  
       
            int count = 0; 
            if (n % p == 0)  
            { 
                while (n % p == 0)  
                { 
                    n = n / p; 
                    count++; 
                } 
                total = total * (count + 1); 
            } 
        } 
    } 
    return total; 
}
}