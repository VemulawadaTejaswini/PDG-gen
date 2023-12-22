import  java.io.InputStreamReader;
import  java.io.BufferedReader;
import java.io.IOException;

class Main {
	public static void main(String[] args){
	char s;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
	String str = null;
    try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
      
      if(str.compareTo("a") < 0){
      	System.out.println("A");
      }
      else{
		System.out.println("a");
      }
        
    }
}