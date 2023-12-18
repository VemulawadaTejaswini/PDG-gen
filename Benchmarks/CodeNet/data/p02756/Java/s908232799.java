import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        String s = key.nextLine();
        int num = key.nextInt();
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i<num ; i++)
        {
            int entry = key.nextInt();
            if(entry == 1)
            {
                sb = sb.reverse();
            }
            else if(entry == 2)
            {  
                String full = key.nextLine();
                String[] Value = full.split(" ");
                if(Value[1].equals("1"))
                {
                    sb.insert(0,Value[2]);
                    
                }
                else if(Value[1].equals("2"))
                {
                    sb.append(Value[2]);
    
                }
            }
        }

        System.out.println(sb);
        
    }
}