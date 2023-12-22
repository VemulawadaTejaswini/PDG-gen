import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strs = new String[str.length()];                    
                    
                    for(int i=0;i<str.length();i++){
                        strs[i] = String.valueOf(str.charAt(i));
                        if(strs[i].toUpperCase().equals(strs[i])){
                            strs[i] = strs[i].toLowerCase();
                        }else if(strs[i].toLowerCase().equals(strs[i])){
                            strs[i] = strs[i].toUpperCase();
                        }
                    }
                    
                    StringBuilder sb = new StringBuilder();
                    for(int i=0;i<strs.length;i++){
                        //System.out.print(strs[i]);
                        sb.append(strs[i]);
                    }
                    System.out.println(sb.toString());
  }
}