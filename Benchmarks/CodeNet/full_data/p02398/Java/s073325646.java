import java.io.*;

class Main
{
    public static void main (String[ ] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        //StringBuffer sb = new StringBuffer();
        
        String[] strAry = (br.readLine()).split(" ");
        int a = Integer.parseInt(strAry[0]);
        int b = Integer.parseInt(strAry[1]);
        int c = Integer.parseInt(strAry[2]);
        
        int cnt = 0;
        for(int i = a; i <= b; i++)
        {
            if(0 == (c % i))
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}