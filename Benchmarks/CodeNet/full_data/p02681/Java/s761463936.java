import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String s = br.readLine();
            String t = br.readLine();

            t = t.substring(0, t.length()-1);
            //System.out.println(t);

            if(s.equals(t)){
              System.out.println("Yes");
            }else{
              System.out.println("No");  
            }
        }

    }
}