import java.io.*;



class fun
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long a,b,c,d,r=0;
        String in=br.readLine();
        String inp[]=in.split(" ");

        a=Long.parseLong(inp[0]);
        b=Long.parseLong(inp[1]);
        c=Long.parseLong(inp[2]);
        d=Long.parseLong(inp[3]);

        if(d<=a)
        {
            System.out.println(d);
        }
        else{
            d-=a;
            r+=a;

            if (d<=b) {
                System.out.println(r);
            }
            else
            {
                d-=b;
                r-=d;
                System.out.println(r);
            }
        }
    }
}