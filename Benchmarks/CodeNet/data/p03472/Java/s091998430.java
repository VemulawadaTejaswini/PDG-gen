import java.io.*;
import java.math.*;
import java.util.*;
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scan sn=new Scan();
        Print p=new Print();
        int n=sn.scanInt();
        int h=sn.scanInt();
        int[]a=new int[n];
        int[]b=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sn.scanInt();
            b[i]=sn.scanInt()*-1;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        b[i]=-1*b[i];
        int[]pre=new int[n];
        pre[0]=b[0];
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]+b[i];
        }
        
        int poss1=((int)1e9);
        for(int i=0;i<n;i++)
        {
            if(pre[i]>=h)
            poss1=i+1;
        }
        int poss2=(int)1e9;
        for(int i=0;i<n;i++)
        {
            int aa=((int)Math.ceil(((((double)h)-((double)pre[i])))/((double)a[n-1])))+i+1;
            if(aa<1)
            aa=1;
            poss2=Math.min(aa,poss2);
        }
        
        int poss3=(int)1e9;
        poss3=Math.min(poss3,(int)Math.ceil((((double)h)/((double)a[n-1]))));
         //System.out.println(poss1+" "+poss2+" "+poss3);
        p.printLine(Integer.toString(Math.min(poss3,Math.min(poss1,poss2))));
        p.close();
    }
}
class Scan
{
    private byte[] buf=new byte[1024];
    private int index;
    private InputStream in;
    private int total;
    public Scan()
    {
        in=System.in;
    }
    public int scan()throws IOException
    {
        if(total<0)
            throw new InputMismatchException();
        if(index>=total)
        {
            index=0;
            total=in.read(buf);
            if(total<=0)
                return -1;
        }
        return buf[index++];
    }
    public int scanInt()throws IOException
    {
        int integer=0;
        int n=scan();
        while(isWhiteSpace(n))
            n=scan();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n))
        {
            if(n>='0'&&n<='9')
            {
                integer*=10;
                integer+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        return neg*integer;
    }
    public double scanDouble()throws IOException
    {
        double doub=0;
        int n=scan();
        while(isWhiteSpace(n))
            n=scan();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n)&&n!='.')
        {
            if(n>='0'&&n<='9')
            {
                doub*=10;
                doub+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        if(n=='.')
        {
            n=scan();
            double temp=1;
            while(!isWhiteSpace(n))
            {
                if(n>='0'&&n<='9')
                {
                    temp/=10;
                    doub+=(n-'0')*temp;
                    n=scan();
                }
                else throw new InputMismatchException();
            }
        }
        return doub*neg;
    }
    public String scanString()throws IOException
    {
        StringBuilder sb=new StringBuilder();
        int n=scan();
        while(isWhiteSpace(n))
            n=scan();
        while(!isWhiteSpace(n))
        {
            sb.append((char)n);
            n=scan();
        }
        return sb.toString();
    }
    private boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
            return true;
        return false;
    }
}

class Print
{
    private final BufferedWriter bw;
    public Print()
    {
        bw=new BufferedWriter(new OutputStreamWriter(System.out));
    }
    public void print(String str)throws IOException
    {
        bw.append(str);
    }
    public void printLine(String str)throws IOException
    {
        print(str);
        bw.append("\n");
    }
    public void close()throws IOException
    {
        bw.close();
    }}