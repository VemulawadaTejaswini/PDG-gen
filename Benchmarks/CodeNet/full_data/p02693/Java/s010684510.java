import java.lang.*;
import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int k=Integer.parseInt(bf.readLine());
    String[] s=bf.readLine().split(" ");
    int a=Integer.parseInt(s[0]);
    int b=Integer.parseInt(s[1]);
    if((b-a)>=k){
      System.out.println("OK");
    }
    else{
      if(b%k==0 || a%k==0){
        System.out.println("OK");
      }
      else if(a%k=<b%k){
        System.out.println("OK");
      }
      else{
        System.out.println("NG");
      }  
    }
  }
}
