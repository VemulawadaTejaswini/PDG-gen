import java.io.*;
public class amin{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    String s = reader.readLine();
    reader.close();
    if(a>3200){
      System.out.println(s);}
     else{
       System.out.println("Red");}}}