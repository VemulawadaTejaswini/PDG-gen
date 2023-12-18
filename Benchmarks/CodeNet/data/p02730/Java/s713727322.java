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
    c=0;
    while(i-1-c!=c)
     {
       if(ch[c]!=ch[i-c-1])
        {
          b=false;
          break;
         }      
         c++; 
      }
     c=1;
    while(i+c<n)
    {
     if(ch[i+c]!=ch[n-c])
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