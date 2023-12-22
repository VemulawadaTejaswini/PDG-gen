import java.io.*;

class Main
{
    public static void main (String[ ] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        StringBuffer sb = new StringBuffer();
        
        while(true)
        {
            String[] strAry = (br.readLine()).split(" ");
            int h = Integer.parseInt(strAry[0]);
            int w = Integer.parseInt(strAry[1]);
        
            if(0 == h & 0 == w)
            {
                break;
            }

            for(int i = 0; i < h; i++)
            {
                sb.append("#");
                for(int j = 0; j < (w - 2); j++)
                {
                    if(0 == i || (h - 1) == i )
                    {
                        sb.append("#");
                    }
                    else
                    {
                        sb.append(".");
                    }
                }
                sb.append("#").append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}