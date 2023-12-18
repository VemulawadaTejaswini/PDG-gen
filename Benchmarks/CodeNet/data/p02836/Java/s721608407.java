import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();
    System.out.println(solve(s));}
  public static int solve(String s){
    int i = 0;
    int res = 0;
    int j = s.length()-1;
    while(i<j){
      if(s.charAt(i)!=s.charAt(j)){
        res++;}
      i=i+1;
      j--;}
    return res;}}
      
    