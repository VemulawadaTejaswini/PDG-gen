import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
public class Main{
	public static int single(int a[]){
		int c = 0x80000000;
		int dp[] = new int[a.length];
		dp[0] = a[0];
		for(int i=1;i<a.length;i++){
			dp[i] = Math.max(dp[i-1]+a[i], a[i]);
			if(c<dp[i]){
				c = dp[i];
			}
		}
		return c;
	}
    public static void main(String[] args) throws Exception {
        new Main();
    }
    public Long num(int []a){
        String s = new String();
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return Long.parseLong(s);
    }
    
    Main() throws Exception {
        InputReader in=new InputReader (System.in);
        PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String  s = in.next();
        if(s.length()==2)
        	System.out.println(s);
        else if(s.length()==3)
        {
        	StringBuffer tmps = new StringBuffer(s);
        	System.out.println(tmps.reverse().toString());
        }
        
        
        
       
        
       
      
    }
}
class InputReader {
    private BufferedReader reader;
    private char[]buf;
    private int len,now;
    public InputReader(InputStream stream) throws IOException {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        buf=new char[1024];
        len=0;now=0;
    }
 
    public String next() throws IOException {
        if(!hasNext())throw new NullPointerException();
        StringBuilder sb=new StringBuilder();
        while(!isSpaceChar(buf[now])){
            sb.append(buf[now]);
            if(!move())break;
        }
        return sb.toString();
    }
    public int nextInt() throws IOException {
        if(!hasNext())throw new NullPointerException();
        boolean x=false;
        if(buf[now]=='-'){
            x=true;
            if(!move())throw new NumberFormatException();
        }
        int ans=0;
        while(!isSpaceChar(buf[now])){
            if(isNum(buf[now]))ans=ans*10+buf[now]-'0';
            else throw new NumberFormatException();
            if(!move())break;
        }
        return (x?-1:1)*ans;
    }
    public String nextLine() throws IOException {
        if(!hasNextLine())throw new NullPointerException();
        StringBuilder sb=new StringBuilder();
        while(buf[now]!='\n'){
            sb.append(buf[now]);
            if(!move())return sb.toString();
        }
        now++;
        return sb.toString();
    }
 
    public boolean hasNext() throws IOException {
        return skip();
    }
    public boolean hasNextLine() throws IOException {
        return now < len || refill();
    }
 
    private boolean move() throws IOException {
        now++;
        return hasNextLine();
    }
    private boolean skip() throws IOException {
        if(!hasNextLine())return false;
        while(isSpaceChar(buf[now])){
            if(!move())return false;
        }
        return true;
    }
    private boolean isSpaceChar(char c) { return !(c >= 33 && c <= 126); }
    private boolean isNum(char c){return c>='0'&&c<='9';}
    private boolean refill() throws IOException {
        len=reader.read(buf);
        now=0;
        return len>0;
    }
}

	