import java.util.*;

public class test{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String word;
        String neww=new String();
        word=sc.next();
        char nword[]=new char[word.length()];
        int lenth=word.length();
        if(nword[lenth-1]!='s')
        {
            neww=word+'s';
        }
        else if(nword[lenth-1]=='s')
        {
            neww=word+"es";
        }
        System.out.println(neww);
    }
}