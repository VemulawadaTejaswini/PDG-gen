import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int i=1;
        int jud=0;
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        while(true)
        {
            int x=i;
            
            if(x%3==0 && jud==0)
            {
                System.out.printf(" %d",i);
                jud=1;
            }
        
            if(jud!=1)
            {
                if(x%10==3)
                {
                    System.out.printf(" %d",i);
                    jud=2;
                }
                
                if(jud!=2)
                {
                    x/=10;
                    if(x!=0)
                    {
                        jud=0;
                    }
                }
            }
            
            if(++i>n && jud==1)
            {
                break;
            }
            
            jud=0;
        }
        System.out.print("\n");
    }
}