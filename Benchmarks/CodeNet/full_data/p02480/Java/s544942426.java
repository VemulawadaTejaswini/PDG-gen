import java.io.*;

class Main{
 public static void main(String args[]){
  int i;
  BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
  try{
   i = Integer.valueOf(d.readLine());
  }catch(Exception e){
   System.out.println("¦Á");
  }
  i = i * i * i;
  System.out.println(i);
 }
}