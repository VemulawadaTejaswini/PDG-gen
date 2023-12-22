import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
  public static void main(String args[]) throws IOException{
   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String[] token = br.readLine().split(" ");
   int r = Integer.parseInt(token[0]);      
   int c = Integer.parseInt(token[1]);   

   for(int i = 0;i < r; i++){
      String[] token = br.readLine().split(" ");
      int sum = 0;
      for(int j = 0;j < c; j++){      
        System.out.print(token[j] + " ");
        sum += Integer.parseInt(token[j]);
      }
      System.out.println(sum);
   }
    
  }
}