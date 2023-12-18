import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReaader;

public static void main(String[] args){
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);

  String[] S = null;
  String[] T = null;
  
  try{
    S = br.readLine();
    br.close();
    T = br.readLine();
    br.close();
  }catch(IOException e){
   e.printStackTrace(); 
  }
  
  System.out.println(T+S);
}