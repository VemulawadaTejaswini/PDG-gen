import java.io.*;
import java.lang.*;

class Main{ 
public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
    while(str != null)
        str = br.readLine();

        String[ ] str_div = str.split("\n");
        int count =  Integer.parseInt(str_div.length);
        for(int i;i < count; i++){
        System.out.println("Case " + i + "; " + str_div[i]);
    }               
   }
  }  