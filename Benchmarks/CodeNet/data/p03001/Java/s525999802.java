import java.io.*;
public class Main
{
    public static void main(String[] argv)
    {
        int W=0,H=0,x=0,y=0;
        try
        {
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            String[] d=bf.readLine().split(" ");
            W=Integer.parseInt(d[0]);
            H=Integer.parseInt(d[1]);
            x=Integer.parseInt(d[2]);
            y=Integer.parseInt(d[3]);
        }
        catch (IOException e)
        {
            System.out.println(e);
            System.exit(0);
        }
            
            System.out.printf("%f",(double)W*H/2);
            if(2*x==W && 2*y==H)
            {
                System.out.println(" 1");
            }
            else
            {
                System.out.println(" 0");
            }
        
    }
}
