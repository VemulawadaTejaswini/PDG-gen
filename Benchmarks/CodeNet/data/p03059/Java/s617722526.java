import java.util.*;
class Main
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int t= s.nextInt();
        if(a>t)
        {
            System.out.println(0);
            return;
        }

        int ans =0;
        int i=1;
        while(t>0)
        {
            i++;
            if(i==a)
            {
                ans+=b;
                i=0;
            }
            t--;
        }

        System.out.println(ans);

        

    
    }
    

}