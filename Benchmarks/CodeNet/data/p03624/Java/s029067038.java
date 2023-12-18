import java.util.*;
public class Main {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s;
        s=input.next();
        char a='a';
        int sum=0;
        int u=('z'-'a');
        boolean k=false;
        boolean m=false;
        char [] arr=new char[s.length()];
        for(int i=0;i<s.length();i++)
            arr[i]=s.charAt(i);
        for(int i=0;i<24;i++)
        {
            a=(char) ('a'+i);
            for(int p=0;p<s.length();p++)
            {
                if(a==arr[p])
                {
                    m=true;
                    break;
                }
            }
            if(m)
            {
                m=false;
                continue;
            }
            else {
                System.out.println(a);
                k=true;
                break;
            }
        }
        if(!k)
            System.out.println("None");
        
    }
    
}
