import java.io.*;
import java.util.*;

class Main {
    static int[] dirX = {-1,-1,-1,0,0,1,1,1};
    static int[] dirY = {0,1,-1,1,-1,0,1,-1};
    public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        int m = sc.scanInt();
        int n = sc.scanInt();
        char[][] grid = new char[m][n];
        
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                char curr = sc.scanCharacter();
                if((int) grid[i][j] == 0){
                    grid[i][j] = '0';
                }
                if(curr == '#'){
                    grid[i][j] = curr;
                    for(int k = 0; k < 8; ++k){
                        int newX = i + dirX[k];
                        int newY = j + dirY[k];
                        if(newX < m && newX >= 0 && newY < n && newY >= 0){
                            char already = grid[newX][newY];
                            if((int)already == 0)
                                already = '1';
                            else if(already != '#'){
                                already += 1;
                            }
                            grid[newX][newY] = already;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j)
                System.out.print(grid[i][j]);
            System.out.println();
        }
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