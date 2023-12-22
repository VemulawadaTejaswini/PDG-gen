import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
   
public class Main {
     
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
     
    public void exec() throws IOException {
        SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.readInt();
        int[] S = in.readIntArray(new int[n+1],n);
        int q = in.readInt();
        int[] T = in.readIntArray(new int[q],q);
        int C = 0;
        for(int i=0; i<q; i++) {
        	int j=0;
        	for(S[n] = T[i]; T[i]!=S[j]; j++);
        	if(j<n) C++;
        }
        out.println(C);
        out.flush();
    }
}
 
class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    public int readInt() throws NumberFormatException, IOException{
        return Integer.parseInt(br.readLine());
    }
     
    public int[] readIntArray(int[] a, int num) throws NumberFormatException, IOException{
        int i=0;
        while(i<num) {
            for(String s: br.readLine().split(" ")){
                if(i<num) {
                    a[i++] = Integer.parseInt(s);
                }
            }
        }
        return a;
    }
 
     
}