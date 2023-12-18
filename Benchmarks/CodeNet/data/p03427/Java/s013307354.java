import java.io.*;

public class Main
{
	static InputReader in;    
	static PrintWriter out;  
	
	
	/**
     * @param args
     * @throws IOException
     */
	
    public static void main(String[] args) throws IOException
    {
    	in = new InputReader(System.in);    
        out = new PrintWriter(System.out);
        
        String n=in.next();
        int count=0,sum=0;
        int l=n.length();
        for(int i=1;i<l;i++)
        {
        	if(n.charAt(i)!=9)
        	{
        		count=i;
        		break;
        	}
        }
        if(count==0)
        {
        	if(l==1)
        		out.println(n);
        	else
        	{
        		for(int i=0;i<l;i++)
        		{
        			sum+=(int)n.charAt(i)-48;
        		}
        		out.println(sum);
        	}
        }
        else
        {
        	for(int i=0;i<l;i++)
        	{
        		if(i==(count-1))
        		{
        			sum+=(int)n.charAt(i)-49;
        			break;
        		}
        		else
        			sum+=(int)n.charAt(i)-48;
        	}
        	for(int i=count;i<l;i++)
        	{
        		sum+=9;
        	}
        	out.println(sum);
        }
        
        out.close();
    }

	static class InputReader {    
        BufferedReader br;    
    
        public InputReader(InputStream stream) {    
            br = new BufferedReader(new InputStreamReader(stream));    
        }    
    
        public int nextInt() throws IOException {    
            int c = br.read();    
            while (c <= 32) {    
                c = br.read();    
            }    
            boolean negative = false;    
            if (c == '-') {    
                negative = true;    
                c = br.read();    
            }    
            int x = 0;    
            while (c > 32) {    
                x = x * 10 + c - '0';    
                c = br.read();    
            }    
            return negative ? -x : x;    
        }    
    
        public long nextLong() throws IOException {    
            int c = br.read();    
            while (c <= 32) {    
                c = br.read();    
            }    
            boolean negative = false;    
            if (c == '-') {    
                negative = true;    
                c = br.read();    
            }    
            long x = 0;    
            while (c > 32) {    
                x = x * 10 + c - '0';    
                c = br.read();    
            }    
            return negative ? -x : x;    
        }    
    
        public String next() throws IOException {    
            int c = br.read();    
            while (c <= 32) {    
                c = br.read();    
            }    
            StringBuilder sb = new StringBuilder();    
            while (c > 32) {    
                sb.append((char) c);    
                c = br.read();    
            }    
            return sb.toString();    
        }    
    
        public double nextDouble() throws IOException {    
            return Double.parseDouble(next());    
        }    
    }
}


