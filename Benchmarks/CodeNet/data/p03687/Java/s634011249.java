import java.util.*;
import java.io.*;
import java.math.*;

public class Main{

  public static boolean check(char[] arr, int len){
    for(int i=0;i<len; i++){
      if(arr[0] != arr[i]){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int[] c = new int[26];

    String str = in.readLine();

    int min = 100;
    for(int i=str.length()-1;i>=0;i--){
      char[] s = str.toCharArray();
      char a = s[i];
      for(int j=0;j<=(s.length+1)/2;j++){
        if(check(s, s.length-j) && min > j){
          min = j;
        }
        for(int k=0;k<s.length-j-1;k++){
          if(s[k+1]==a){
            s[k]=a;
          }
        }
      }
    }
    System.out.println(min);
  }
}
