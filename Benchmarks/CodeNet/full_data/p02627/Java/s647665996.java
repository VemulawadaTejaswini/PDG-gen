import java.io.*;

class Lol{
	public static void main(String[] args){
      try{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      if(Character.isUpperCase(str.charAt( 0 ))){
      	System.out.println("A");
      }
      else{
        System.out.println("a");
      }
      }
      catch(IOExpection e){
      
      }
    }
}
