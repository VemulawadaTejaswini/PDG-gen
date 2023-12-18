import java.io.*;
class Main
{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			   
String[] strs=br.readLine().trim().split("\\s+");     
  int h,a;
  h=Integer.parseInt(strs[0]);
  a=Integer.parseInt(strs[1]);
  if(h%a==0)
    System.out.println(h/a);
  else
    System.out.println((h/a)+1);
}
}