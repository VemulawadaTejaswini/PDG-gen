import java.util.*;
import java.io.*;
import java.lang.*;

class lol {

   
        static String first(String str)
        {
            StringBuilder a=new StringBuilder();
            a.append(str);
            a=a.reverse();
            
            return a.toString();
        }
        
        static String second(String str,String f,String c)
        {
            if(f.equals("1"))
            str=c+str;
            else if(f.equals("2"))
            str=str+c;
            
            return str;
        }
     public static void main(String[] args)throws IOException {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String S=in.readLine();
        int N=Integer.parseInt(in.readLine());
        while(N-->0)
        {
            String st=in.readLine();
            String[] arr=st.split(" ");
            
            if(arr[0].equals("1"))
            {
               S=first(S); 
                
            }
            
            else if(arr[0].equals("2"))
            {
                S=second(S,arr[1],arr[2]);
                
            }
            
        }
        System.out.println(S);
     }
}