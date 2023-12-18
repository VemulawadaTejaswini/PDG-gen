import java.io.*;
import java.util.*;
class Sample{
    public static void main (String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        for(int i=0;i<12;i++){
            if(i==4) System.out.print(" ");
            System.out.print(str.charAt(i));
        }
    }
    
}