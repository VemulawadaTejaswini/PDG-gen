import java.io.*;
import java.util.*;
public class Main{
 public static void main(String args[])throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String str=null;
  str=br.readLine();
  StringTokenizer st=new StringTokenizer(str);
  while(str!=null){
   int i=Integer.parseInt(st.nextToken());
   int j=Integer.parseInt(st.nextToken());
   System.out.println(String.valueOf(i*j).length());
   str=br.readLine();
  }
 }
}