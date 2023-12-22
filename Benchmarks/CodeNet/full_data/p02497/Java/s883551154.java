import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        int m, f, r;

        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
    	String buf = br.readLine();
        StringTokenizer st = new StringTokenizer(buf," ");
        m = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        
        while(true) {
            if (m == -1 && f == -1 && r==-1) break;
            else if (m == -1 || f == -1) {
                System.out.println("F");
            }
            else if (m + f >= 80) {
                System.out.println("A");
            }
            else if (m + f < 80 && m + f >= 65) {
                System.out.println("B");
            }
            else if (m + f < 65 && m + f >= 50) {
                System.out.println("C");
            }
            else if (m + f < 50 && m + f >= 30) {
                if (r >= 50) System.out.println("C");
                else System.out.println("D");
            }
            else System.out.println("F");
            
            buf = br.readLine();
            st = new StringTokenizer(buf," ");
            m = Integer.parseInt(st.nextToken());
            f = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
        }
    }
}