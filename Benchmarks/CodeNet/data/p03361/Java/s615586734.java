import java.io.*;
import java.util.*;

class Main {
    static int[] dirx = {-1,0,0,1};
    static int[] diry = {0,1,-1,0};
    static char[][] grid;
    static int m, n;
    public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        m = sc.scanInt();
        n = sc.scanInt();
        grid = new char[m][n];
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j) {
                grid[i][j] = sc.scanCharacter();
            }
        }
        if(find())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean find(){
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                if(grid[i][j] == '.')
                    continue;
                boolean found = false;
                for(int k = 0; k < 4; ++k){
                    int newi = i + dirx[k];
                    int newj = j + diry[k];
                    if(newi < m && newi >= 0 && newj < n && newj >= 0 && grid[newi][newj] == '#'){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    return false;
                }
            }
        }
        return true;
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