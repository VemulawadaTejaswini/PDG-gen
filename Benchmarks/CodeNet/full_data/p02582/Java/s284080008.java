import java.util.*;
class MyClass {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
      char c[] = sc.next().toCharArray();
	    
	    int ans = 0,count = 0;
	    
	    for(int i=0;i<c.length;i++)
	    {
	        if(c[i]=='R')
	            count++;
	        else
	        {
	            ans = Math.max(count,ans);
	            count = 0;
	        }
	    }
	    
	    ans = Math.max(count,ans);
	    
	    System.out.println(ans);
    }
}