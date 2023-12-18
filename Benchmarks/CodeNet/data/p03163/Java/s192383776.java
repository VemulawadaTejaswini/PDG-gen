/* package codechef; // don't place package name! */
//@Author=Mr.Kashyap
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
    public static void main(String[] args) throws IOException
    {
        Scan sc = new Scan();
        Print print=new Print();
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=sc.scanInt();
        int capacity=sc.scanInt();
        int w[] =new int[n];
        int v[]=new int[n];
        for(int i=0;i<n;i++){
            w[i]=sc.scanInt();
            v[i]=sc.scanInt();
        }
        long[][] dp=new long[n+1][capacity+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<capacity+1;j++){
                if(w[i-1]<=j){
                    //System.out.println("::"+(v[i-1]+dp[i-1][j-w[i-1]]));
                    dp[i][j]=Math.max(v[i-1]+dp[i-1][j-w[i-1]],dp[i-1][j]);
                }
                else{
                    
                    //System.out.println(":"+(v[i-1]+dp[i-1][j-w[i-1]]));
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][capacity]);
        bw.close();
    }
    
    /*BufferedWriter with scanInt, (long)scanDouble, scanString , bw.append(""+\n)*/
	
    static class Print
    {
        private final OutputStream out;
        /*public Print(OutputStream outputStream)
        {
            writer=new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }*/
        public Print()
        {
            this.out=System.out;
        }
        public void print(String str)throws IOException
        {
            //buf=str.getBytes();
            for (int i = 0; i < str.length(); i++)
            {
			/*if (i != 0)
			out.write(' ');*/
                out.write(str.charAt(i));
            }
        }
        public void printLine(String str)throws IOException
        {
            print(str);
            out.write('\n');
        }
        public void close()throws IOException
        {
            out.close();
        }
    }
    static class Scan
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
    
}