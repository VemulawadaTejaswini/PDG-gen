import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
  
public class Main {
    private static final String CRLF = System.lineSeparator();
    public void exec() throws IOException {
    	SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int count=0;
        int N = in.readInt();
        int[] A = in.readIntArray(N);
        int tmp;
        for(boolean flag=true;flag;){
        	flag=false;
        	for(int j=N-1;j>=1;j--){
        		if(A[j] < A[j-1]){
        			tmp = A[j];
        			A[j] = A[j-1];
        			A[j-1] = tmp;
        			count++;
        			flag=true;
        		}
        	}
        }
        intArrayToString(A,sb);
        out.print(sb.toString());
        out.println(count);
        out.flush();
    }
    
    private void intArrayToString(int[] a, StringBuilder sb) {
        for(int i=0; i<a.length; i++) {
            if (i>0)
                sb.append(" ");
            sb.append(a[i]);
        }
        sb.append(CRLF);
    }
     
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}

class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int readInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }
    public int[] readIntArray(int len) throws NumberFormatException, IOException{
        int[] a = new int[len];
        int i=0;
        for(String s: br.readLine().split(" ")){
            a[i++] = Integer.parseInt(s);
        }
        return a;
    }
    
}