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
        int[] A = in.readIntArray(in.readInt());
        int swapcount = selectionSort(A);
        intArrayToString(A,sb);
        out.print(sb.toString());
        out.println(swapcount);
        out.flush();
    }
    
    private int selectionSort(int[] A){
    	int ret=0;
    	int minj,tmp;
    	for(int i=0; i<A.length; i++) {
    		minj = i;
    		for(int j=i; j<A.length; j++){
    			if(A[j] < A[minj])
    				minj=j;
    		}
			if(i!=minj){
				tmp = A[i];
				A[i] = A[minj];
				A[minj] = tmp;
				ret++;
			}
    	}
    	return ret;
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