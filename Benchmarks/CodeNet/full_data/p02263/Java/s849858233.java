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
                int l = stack.size()-1;
                int x = stack.get(l);
                int y = stack.get(l -1);
                stack.add(x + y);
           }else if(strs[i].equals("-")){
                int l = stack.size()-1;
                int x = stack.get(l);
                int y = stack.get(l -1);
                stack.add(x - y);
           }else if(strs[i].equals("*")){
                int l = stack.size()-1;    
                int x = stack.get(l);
                int y = stack.get(l-1);
                stack.add(x * y);
           }else{
               int x = Integer.parseInt(strs[i]);
               stack.add(x);
           }
       }

       int l = stack.size()-1;
       System.out.println(stack.get(l));
            
        
        br.close();
    }
   
}

