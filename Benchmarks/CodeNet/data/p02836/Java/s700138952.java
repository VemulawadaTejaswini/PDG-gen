import java.io.*;
public class Main{
  public static void main(String[] args) throws IOExeption{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();
    int i = 0;
    int j = s.length()-1;
    int res=0;
    while(i!=j){
      if(s.charAt(i)==s.charAt(j)){
        i++;
        j--;
        continue;
      }
      else{
        res++;}}}}