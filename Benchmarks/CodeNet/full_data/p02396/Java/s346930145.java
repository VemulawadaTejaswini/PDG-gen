import java.io.*;
public class Main{
  public static void main(String[] args){
    BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
    try{
      int i=1;
      int x;
      String str;
      while((str=mBufferedReader.readLine())!=null){
        x=Integer.parseInt(str);
          if(x==0){
            break;
          }
            System.out.println("Case "+i+": "+str);
            i++;
          }
      mBufferedReader.close();
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
