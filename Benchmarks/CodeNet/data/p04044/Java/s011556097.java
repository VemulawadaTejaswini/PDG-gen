import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Node2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        
     
        
        String[] sp = str.split(" ");
        int[] a = new int[sp.length];
        for(int i=0;i<sp.length;i++){
            a[i] = Integer.parseInt(sp[i]);
        }
        int num = a[0];
        int length = a[1];
      
        String[] strlist = new String[num];
        for(int i=0;i<num;i++){
            strlist[i] = in.readLine();
        }
        
        Arrays.sort(strlist);
        
        System.out.println(strlist[0]+strlist[1]+strlist[2]);
    }
}
