import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        int n, i;
        
        /*??\???????????????????????????*/
        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
    	String buf = br.readLine();
        n = Integer.parseInt(buf);
        
        String first = "";
        
        /*n???????????????????????????*/
        for (i = 1;i <= n;i++) {
            buf = br.readLine();
            if (i == 1) first = buf;
            else {
                int j = 0;
                while (true) {
                    if (buf.charAt(j) < first.charAt(j)) {
                        first = buf;
                        break;
                    }
                    else if (buf.charAt(j) > first.charAt(j)) {
                        break;
                    }
                    else j++;
                    
                    /*??????buf???first????????????????????£?????´???,buf????????????????????§first??????????????????*/
                    if (j == buf.length()) {
                        first = buf;
                        break;
                    }
                    else if (j == first.length()) break;
                }
            }
        }
        System.out.println(first);
    }
}