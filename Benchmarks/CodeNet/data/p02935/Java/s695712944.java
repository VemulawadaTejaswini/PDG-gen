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
    for(int i =0;i<a-1;i++){
 		r = r+(list[i]+list[i+1])/2.0;}
      System.out.println(r);}
}