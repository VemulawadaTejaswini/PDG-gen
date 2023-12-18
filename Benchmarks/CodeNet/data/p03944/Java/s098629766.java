import java.io.*;
import java.util.*;

class Main {
    static int w, h, l, d;
    public static void main(String args[]) throws IOException {
        Scan sc = new Scan();
        w = sc.scanInt();
        h = sc.scanInt();
        int n = sc.scanInt();
        int area = w*h;
        while(n-->0){
            int x = sc.scanInt();
            int y = sc.scanInt();
            int type = sc.scanInt();
            int tarea = area(x, y, type);
            area = Math.max(0, area-tarea);
            if(area == 0){
                System.out.println(0);
                return;
            }
        }
        System.out.println(area);
    }
    static int area(int x, int y, int type){
        if(type == 1){
            int tarea= (x-l)*(h-d);
            l = x;
            return tarea;
        }
        if(type == 2){
            int tarea= (w-x)*(h-d);
            w = x;
            return tarea;
        }
        if(type == 3){
            int tarea= (w-l)*(y-d);
            d=y;
            return tarea;
        }
        if(type == 4){
            int tarea= (w-l)*(h-y);
            h=y;
            return tarea;
        }
        return -1;
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
    public char scanChar() throws IOException {
        int n = scan();
        while(isWhiteSpace(n))
            n=scan();
        return (char)n;
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
    public long scanLong() throws IOException {
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
    public boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
        return true;
        return false;
    }
}
