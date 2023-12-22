import java.io.*;
import java.util.*;
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    s = s.trim();
    String t = br.readLine();
    t = t.trim();
    char tc = t.charAt(0);
    int fl = 0;
    int count = Integer.MAX_VALUE;
    for(int i=0;i<s.length();i++){
      char x = s.charAt(i);
      if(x==tc){
        fl = 1;
        if((i+t.length())-1 <= s.length()-1){
          String y = s.substring(i,(i+t.length()));
          // System.out.println(y);
          int tempCount = 0;
          for(int j=0;j<t.length();j++){
            char tx = t.charAt(j);
            if(tx!=y.charAt(j)){
              tempCount++;
            }
          }
          if(tempCount < count)
            count = tempCount;
        }
      }
    }

    // System.out.println(count);

    if(fl==0){
      count = 0;
      for(int i=0;i<t.length();i++){
        if(s.charAt(i)!=t.charAt(i))
          count++;
      }
    }

    System.out.println(count);
  }
}
