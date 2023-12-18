import java.io.*;



class fun
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a,b,c,d,r=0;
        String in=br.readLine();
        String inp[]=in.split(" ");

        a=Integer.parseInt(inp[0]);
        b=Integer.parseInt(inp[1]);
        c=Integer.parseInt(inp[2]);
        d=Integer.parseInt(inp[3]);

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