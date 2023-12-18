import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    double r = 0.0;
    int[] list =new int[a];
    String[] s =  reader.readLine().split(" ");
    for(int i =0;i<a;i++){
      list[i] = Integer.parseInt(s[i]);}
    Arrays.sort(list);
    r = ((double)list[0]+(double)list[1])/2.0;
    for(int i =2;i<a;i++){
 		r = (r+list[i])/2.0;}
      System.out.println(r);}
  }