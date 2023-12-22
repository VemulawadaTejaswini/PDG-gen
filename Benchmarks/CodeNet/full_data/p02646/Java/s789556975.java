/*input
1 2
3 3
3   
*/




import java.math.*;
import java.io.*;
import java.util.*;
public class Main
{
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead;
public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        }
public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        }
public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        }
public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9');
if (neg) 
                return -ret; 
            return ret; 
        }
public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        }
public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read();
do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9');
if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            }
if (neg) 
                return -ret; 
            return ret; 
        }
private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        }
private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        }
public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 




        static long a,b,c,p,q,r;
    static Reader sc=new Reader();
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[])throws IOException
    {
        /*
         * For integer input: int n=inputInt();
         * For long input: long n=inputLong();
         * For double input: double n=inputDouble();
         * For String input: String s=inputString();
         * Logic goes here
         * For printing without space: print(a+""); where a is a variable of any datatype
         * For printing with space: printSp(a+""); where a is a variable of any datatype
         * For printing with new line: println(a+""); where a is a variable of any datatype
            Scanner in = new Scanner(System.in);
        //all four
         int[] dr = { 1, 0, -1, 0 };
         int[] dc = { 0, 1, 0, -1 };
         */


         int a=inputInt(),v=inputInt();
         int b=inputInt(),w=inputInt();
         int t=inputInt();

         if(a>b && v>=w)
            println("NO");
        else if(b>a && w>=v)
            println("NO");
        else
        {
            int flag=0;
            for(int i=0;i<t;i++)
            {
                a=a+v;
                b=b+w;
                if(a==b)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                println("YES");
            else
                println("NO");
        }




       bw.flush();
        bw.close();

    


 
}




static long find()
{
    if(a == p)
    {
        long temp=a;
        a=c;
        c=temp;

       temp=p;
       p=r;
       r=temp;
    }
    else if(b == q)
    {
         long temp=b;
        b=c;
        c=temp;

        temp=q;
        q=r;
        r=temp;
        
    }
    if((a-p) == (b-q))
        return 1;
    if(p == 0 || q == 0)
        return 2;
    if((a%p == 0) && (b%q == 0) && (a/p == b/q))
        return 1;
    return 2;   
}

        


static boolean findfor1()
{
    if((a-p) == (b-q) && (b-q) == (c-r))
        return true;
    if(a == 0 && b == 0 && c == 0)
        return true;
    if(p == 0 || q == 0 || r == 0)
        return false;
    if((a%p == 0) && (b%q == 0) && (c%r == 0) && (a/p == b/q) && (b/q == c/r))
        return true;
    return false;
}

static boolean findfor2()
{
    if(a == b && b == c)
        return true;
   long cnt = 0;
    cnt =0;
    if(a==0)
        cnt++;
    if(b==0)
        cnt++;
    if(c==0)
        cnt++;
    if(cnt == 2 || (cnt == 1 && (a == b || b == c || a == c)))
        return true;

    // two group have same difference
    if((a-p) == (b-q))
        return true;
    if((a-p) == (c-r))  
        return true;
    if((c-r) == (b-q))
        return true;
    
    // diff1 + diff2 == diff3 ==> only 2 steps required
    long d1 = a-p , d2 = b-q , d3 = c-r;
    if(d1+d2 == d3 || d1+d3 == d2 || d2+d3 == d1)
        return true;
    
    // two groups have same quotient
    if((p!=0) && (q!=0))
    {
        if((a%p == 0) && (b%q == 0) && (a/p == b/q))
            return true;
    }
    if((p!=0) && (r!=0))
    {
        if((a%p == 0) && (c%r == 0) && (a/p == c/r))
            return true;
    }
    if((q!=0) && (r!=0))
    {
        if((c%r == 0) && (b%q == 0) && (c/r == b/q))
            return true;
    }
    
    // q1 * q2 == q3 ==> only 2 steps required
    if(p!=0 && q!=0 && r!=0) // checking if p , q and r all are non zero
    {
        long m1 = 1l * a/p , m2 = 1l * b/q , m3 = 1l * c/r;
        if(!(a%p==0 || b%q==0 || c%r==0)) // checking if a , b and c is divisible by p , q and r respectively
        {
            if(m1*m2 == m3 || m2*m3 == m1 || m1*m3 == m2)
            {
                return true;
            }
        }
    }

    //px = a ,  qx+y = b , r+y = c
    if(p!=0 && q!=0)
    {
        if(a%p == 0 && (b-d3)%q == 0 && a/p == (b-d3)/q)
            return true;
        if((a-d3)%p == 0 && b%q == 0 && (a-d3)/p == b/q)
            return true;
    }
    if(q!=0 && r!=0)
    {
        if(b%q == 0 && (c-d1)%r == 0 && b/q == (c-d1)/r)
            return true;
        if((b-d1)%q == 0 && c%r == 0 && (b-d1)/q == c/r)
            return true;
    }
    if(r!=0 && p!=0)
    {
        if(c%r == 0 && (a-d2)%p == 0 && c/r == (a-d2)/p)
            return true;
        if((c-d2)%r == 0 && a%p == 0 && (c-d2)/r == a/p) 
            return true;
    }

    //px = a , q+y = b , (r+y)x = c
    if(p!=0)
    {
        if(r+d2!=0)
        {
            if(a%p == 0 && c%(r+d2) == 0 && a/p == c/(r+d2))
                return true;
        }
        if(q+d3!=0)
        {
            if(a%p == 0 && b%(q+d3) == 0 && a/p == b/(q+d3))
                return true;
        }
    }
    if(q!=0)
    {
        if(r+d1!=0)
        {
            if(b%q == 0 && c%(r+d1) == 0 && b/q == c/(r+d1))
                return true;
        }
        if(p+d3!=0)
        {   
            if(b%q == 0 && a%(p+d3) == 0 && b/q == a/(p+d3))
                return true;   
        }
    }
    if(r!=0)
    {
        if(p+d2!=0)
        {
            if(c%r == 0 && a%(p+d2) == 0 && c/r == a/(p+d2))
                return true;
        }
        if(q+d1!=0)
        {
            if(c%r == 0 && b%(q+d1) == 0 && c/r == b/(q+d1))
                return true;
        }
    }

    // px = a , qx+y = b , rx+y = c
    if(p!=0 && r!=q)
    {
        if(a%p == 0 && (c-b)%(r-q) == 0 && (c-b)/(r-q) == a/p)
            return true;
    }
    if(q!=0 && r!=p)
    {
        if(b%q == 0 && (c-a)%(r-p) == 0 && (c-a)/(r-p) == b/q)
            return true;
    }
    if(r!=0 && p!=q)
    {
        if(c%r == 0 && (b-a)%(q-p) == 0 && (b-a)/(q-p) == c/r)
            return true;
    }

    // p+y = a , qx+y = b , rx+y = c
    if(r!=q)
    {
        long x = (c-b)/(r-q);
        if((c-b)%(r-q) == 0 && (c-r*x) == d1)
            return true;
    }
    if(r!=p)
    {
       long x = (c-a)/(r-p);
        if((c-a)%(r-p) == 0 && (c-r*x) == d2)
            return true;
    }
    if(p!=q)
    {
        long x = (b-a)/(q-p);
        if((b-a)%(q-p) == 0 && (b-q*x) == d3)
            return true;
    }

    // p+y = a , (q+y)x = b , (r+y)x = c
    if(q+d1!=0 && r+d1!=0)
    {
        if(b%(q+d1) == 0 && c%(r+d1) == 0 && b/(q+d1) == c/(r+d1))
            return true;
    }
    if(p+d2!=0 && r+d2!=0)
    {
        if(a%(p+d2) == 0 && c%(r+d2) == 0 && a/(p+d2) == c/(r+d2))
            return true;
    }
    if(p+d3!=0 && q+d3!=0)
    {
        if(a%(p+d3) == 0 && b%(q+d3) == 0 && a/(p+d3) == b/(q+d3))
            return true;
    }



    // an example to understand this case :-
    // p-1 q-5  r-2
    // a-6 b-22 c-10
    // 6=1*4+2 , 22=5*4+2 , 10=2*4+2 ==> only 2 steps required
    // imp observation :- in this case (px+y) - (qx+y) == (p-q)x is multiple of (p-q) and 
    // this lead to the below logic
    if((p!=q) && (q!=r))
    {
        if( ((b-a) % (q-p) == 0) && ((c-b) % (r-q) == 0) && ((b-a)/(q-p) == (c-b)/(r-q)) )
            return true;
    }
    return false;
    
}





        public static int modulo(int x,int N)
        {
            return (x % N + N) %N;
        }
        public static long lcm(long a,long b)
        {    
            return a / gcd(a, b) * b;
        }
        public static long gcd(long a,long b)
        {
            if(b==0)
                return a;
            return gcd(b,a%b);
        }

     public static int inputInt()throws IOException
    {
        return sc.nextInt();
    }
    public static long inputLong()throws IOException
    {
        return sc.nextLong();
    }
    public static double inputDouble()throws IOException
    {
        return sc.nextDouble();
    }
    public static String inputString()throws IOException
    {
        return sc.readLine();
    }
    public static void print(String a)throws IOException
    {
        bw.write(a);
    }
    public static void printSp(String a)throws IOException
    {
        bw.write(a+" ");
    }
    public static void println(String a)throws IOException
    {
        bw.write(a+"\n");
    }
}