import java.util.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner obj=new Scanner(System.in);
        int i,c=0;String ns="";
        String s=obj.nextLine();
        String t=obj.nextLine();
        for(i=0;i<s.length();i++)
           {
               if(s.charAt(i)!=t.charAt(i))
                    c++;
               else
                    continue;
            }
        System.out.println(c);   
    }
}