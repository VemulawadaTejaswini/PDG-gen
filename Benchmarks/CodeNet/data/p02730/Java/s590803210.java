import java.util.*;
public class Main
{
public static void main(String[] args)
    { 
       Scanner s=new Scanner(System.in);
       String st=s.next();
       int n=st.length();
       char ch[]=st.toCharArray();
       boolean b=true;
       int c=1;
       int i=(n-1)/2;
       while(i+c<n)
       {     
        if(ch[i+c]!=ch[i-c])
        {
         b=false;
   	 break;
    	}
      c++;
     }
    
 if(b)
System.out.println("Yes");
 else
System.out.println("No");
}
}