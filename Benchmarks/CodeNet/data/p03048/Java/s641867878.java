import java.io.*;
import java.util.*;

class Main {
    static int x, y, z;
    public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        int a = sc.scanInt();
        int b = sc.scanInt();
        int c = sc.scanInt();
        int d = sc.scanInt();
        int res = 0;
        for(int i = 0; i*a <= d; ++i){
            int rightSide = d - (a*i);
            if(rightSide == 0)
                ++res;
            else {
                int tr = solve(b, c, rightSide);
                res += tr;
            }
        }
        System.out.println(res);
        
    }
    static void egcd(int a, int b){
        if(b == 0){
            x = 1;
            y = 0;
            z = a;
            return;
        }   
        
        egcd(b, a%b);
        int t = y;
        y = x - (a/b)*y;
        x = t;
    }
    
    static int solve(int b, int c, int r){
        if(r < Math.min(b, c))
            return 0;
        egcd(b, c);
        if(x < y){
            int t = c;
            c = b;
            b = t;
            t = x;
            x = y;
            y = t;
        }
        if(r%z != 0)
            return 0;
        x *= r;
        y *= -r;
        int k1 = x/c;
        int k2 = (y+b-1)/b;
        if(k1 < k2)
            return 0;
            int res = k1-k2+1;
        return (k1-k2+1);
    }
}

class Scan {
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
    public long scanLong()throws IOException
    {
        long integer=0;
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
    
    public char scanCharacter() throws IOException {
        int n=scan();
        while(isWhiteSpace(n))
        n=scan();
        return (char)n;
    }
    private boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
        return true;
        return false;
    }
}