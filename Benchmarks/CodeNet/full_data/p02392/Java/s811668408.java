import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str="";
        int[] a=new int[3];
        try {
        		str = br.readLine();
                StringTokenizer st=new StringTokenizer(str," ");
                int i=0;
    		     while (st.hasMoreTokens()) {
    		    	 a[i]=Integer.parseInt(st.nextToken());
    		    	 i++;
    		     }i=0;
                if(a[0] < a[1] && a[1] < a[2]){
                System.out.print("YES");
                }else{
                System.out.print("NO");
                }
                str="";
        } catch(IOException e) {
        	System.exit(0);
        }
    }
}