import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static final String CRLF = System.getProperty("line.separator");
    public void exec() throws IOException {
        InputUtil input = new InputUtil();
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        while(true) {
            int H = input.nextInt();
            int W = input.nextInt();
            if(H==0 && W==0) break;
            for(int y=0; y<H; y++) {
                for(int x=0; x<W; x++) {
                    sb.append((x+y)%2==0 ? "#" : ".");
            	}
                sb.append(CRLF);
            }
            sb.append(CRLF);
        }
        out.print(sb.toString());
        out.flush();
        input.close();
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }

}
 
/**
 * --------------------------------------------------
 * Input Utility
 * --------------------------------------------------
 */
class InputUtil {
    //Static Fields
    private static final int BUFSIZ = 2100005;
     
    //Fields
    protected InputStream in;
    private char[] buf = null;
    private int ptr = 0;
    private int max = -1;
    private BufferedReader br = null;
     
    //Constructors
    public InputUtil() {this(System.in,BUFSIZ);}
    public InputUtil(int bufsiz) {this(System.in,bufsiz);}
    public InputUtil(InputStream in) {this(in,BUFSIZ);}
    public InputUtil(InputStream in, int bufsiz) {
        initBuf(bufsiz);
        initIn(in);
    }
     
    //Methods
    //Initializer
    protected void initIn(InputStream in) {br = new BufferedReader(new InputStreamReader(this.in = in));}
    protected void initBuf(int bufsiz) {buf = new char[bufsiz];}
     
    //String Input Reader/Parser
    private void readBuf() throws IOException {
        if(ptr >= max && br.ready()) {
            max = br.read(buf);
            ptr = 0;
        }
    }
     
    public BufferedReader getReader() {return br;}
     
    //Number Input Reader/Parser
    private boolean isNum(char b) {return '0' <= b && b <= '9'; }
    private boolean isMinus(char b) {return b=='-'; }
    private void next() throws IOException {ptr++; readBuf();}
 
 
    public int nextInt() throws IOException {return nextInt(new int[1])[0];}
    public int[] nextInt(int[] result) throws IOException {
        readBuf();
        for(int i=0; i<result.length; i++) {
            int sign = 1;
            int res = 0;
            char c;
            while (!isNum(c=buf[ptr]) && !isMinus(c)) 
                next();
            if (isMinus(buf[ptr])) {
                sign = -1;
                next();
            }
            while (isNum(c=buf[ptr])) {
                res *= 10;
                res += c - '0' ;
                next();
            }
            next();
            result[i] = sign * res;
        }
        return result;
    }
     
    //Close 
    public void close() throws IOException {
        if(!this.in.equals(System.in)) 
            this.in.close();
    }
 
}