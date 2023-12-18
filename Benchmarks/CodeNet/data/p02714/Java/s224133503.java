import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int K = in.nextInt();
    in.nextLine();
    String s = in.nextLine();
    char[] ss = s.toCharArray();
    
    long count = 0;
    for(int i = 0; i < K; i++) {
      for(int j = i+1; j < K; j++) {
          for(int k = j+1; k < K; k++) {
              if(ss[i] != ss[j] && ss[j] != ss[k] && ss[i] != ss[k] && (j-i) != (k-j)){
                  count++;
              }
          }
      }
    }
    
    System.out.println(count);
    
  }
  
}