import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
  public static void main(String args[]) throws IOException{
   int m,f,r,sum;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String line = br.readLine(); 
   String[] token = line.split(" ");

   while(true){
    line = br.readLine(); 
    token = line.split(" ");
    m = Integer.parseInt(token[0]);      
    f = Integer.parseInt(token[1]);
    r = Integer.parseInt(token[2]);
    if(m == -1 && f == -1 && r == -1)break;
    
   }
 
  }
}