import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

    public static int digits(int x)
    {
        int n =0;

        while(x>0)
        {
            x=x/10;
            n++;
        }

        return n;
    }

    public static void main(String[] args)  throws IOException {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());

        //int dig = digits(t);

        int ct=0;

        for(int i=1;i<=t;i++)
        {
            int dig = digits(i);

            if(dig%2!=0)
            {
                ct++;
            }
        }

        System.out.println(ct);

    }
}
