import java.io.*;
import java.lang.*; 
import java.util.*; 
 
class Main{ 
public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> str = new ArrayList<String>();
         str.add(br.readLine().split(" "));
          Collections.sort(str);
          int x = Integer.parseInt(str[0]);
          int y = Integer.parseInt(str[1]);
          int z = Integer.parseInt(str[2]);
        
        System.out.println(x + " " + y + " " + z);
 }
}
   