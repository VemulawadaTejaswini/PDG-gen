import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        str = br.readLine();
        String[] strs = str.split("\\s");
        ArrayList<Integer> stack = new ArrayList<Integer>();

       for(int i=0;i<strs.length;i++){
           if(strs[i].equals("+")){
               int x = Integer.parseInt(strs[i-2]);
               int y = Integer.parseInt(strs[i-1]);
               stack.add(x + y);
           }else if(strs[i].equals("-")){
            int x = Integer.parseInt(strs[i-2]);
            int y = Integer.parseInt(strs[i-1]);
            stack.add(x - y);
           }else if(strs[i].equals("*")){
                int l = stack.size();    
                int x = stack.get(l-1);
                int y = stack.get(l-2);
                stack.add(x * y);
           }
       }

       int l = stack.size();
       System.out.println(stack.get(l-1));
            
        
        br.close();
    }
   
}

