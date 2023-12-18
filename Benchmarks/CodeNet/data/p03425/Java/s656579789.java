import java.io.*;
import java.util.*;

class Main {
    static char[] carr = {'M','A','R','C','H'};
    static List<String> combs;
    static StringBuilder sb;
    public static void main(String args[]) throws IOException {
        Scan sc = new Scan();
        int n = sc.scanInt();
        int[] freq = new int[256];
        for(int i = 0; i < n; ++i){
            char first = sc.scanString().charAt(0);
            freq[first]++;
        }
        long res= 0;
        fillCombs();
        for(String str : combs){
            long tres = 1;
            for(char c : str.toCharArray()){
                tres *=(freq[c]);
            }
            res += tres;
        }
        System.out.println(res);
    }
    
    static void fillCombs(){
        sb = new StringBuilder();
        combs = new ArrayList<String>();
        for(int i = 0; i < 5; ++i){
            char a = carr[i];
            for(int j= i+1; j < 5; ++j){
                char b = carr[j];
                for(int k = j+1; k < 5; ++k){
                    char c = carr[k];
                    sb.append(a).append(b).append(c);
                    combs.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
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
    private boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
        return true;
        return false;
    }
}
