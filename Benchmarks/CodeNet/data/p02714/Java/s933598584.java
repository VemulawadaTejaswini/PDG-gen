import java.util.Scanner;



public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        key.nextLine();
        String s = key.nextLine();
        long ca =0;
        long cb = 0;
        long cc = 0;
        
        for(int i = 0; i<num ; i++)
        {
            char c = s.charAt(i);
            if(c == 'R')
                ca ++;
            else if(c == 'G')
                cb ++;
            else
                cc++;

        }
        long total = ca * cb * cc;

        for(int j = 0; j<num; j++)
        {
            for(int k = 0; k<num; k++)
            {
                int a = j + k;
                int b = a + k;
                if(b>=num) 
                    break;
                else
                {
                    if(s.charAt(j) != s.charAt(a) && s.charAt(j) != s.charAt(b) && s.charAt(a) != s.charAt(b))
                        total = total - 1;
                }
                
            }
        }

        System.out.println(total);
        
    }
}