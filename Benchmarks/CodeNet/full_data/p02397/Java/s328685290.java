import java.io.*;

class Main
{
????????public static void main (String[ ] args) throws Exception
    {
????????????????BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        StringBuffer sb = new StringBuffer();
        
        while()
        {
            String[] strAry = br.readLine().split();
            int x = Integer.parseInt(strAry[0]);
            int y = Integer.parseInt(strAry[1]);
            
            if(0 == x && 0 == y)
            {
                break;
            }
            
            if(x > y)
            {
                sb.append(y + " " + x + "\n");
            }
            else
            {
                sb.append(x + " " + y + "\n");
            }
        }
????????????????System.out.println(sb);
    }
}