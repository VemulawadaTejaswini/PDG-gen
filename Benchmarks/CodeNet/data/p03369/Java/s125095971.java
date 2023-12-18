import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int addon = 0;
        
        for(int i = 0; i < 3; i++) if(str.charAt(i) == 'o') addon += 100;
        
        System.out.println(700 + addon);
    }
}
