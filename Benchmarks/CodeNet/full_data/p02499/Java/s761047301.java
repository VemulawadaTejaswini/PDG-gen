import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
      String line = buf.readLine();
      char[] asd = line.toCharArray();
      int[] answer_num = new int[26];
      for(int i=0; i<26; i++){
        for(int j=0; j<asd.length; j++){
          if((asd[j]-'a')==i || (asd[j]-'A')==i){
            answer_num[i]=answer_num[i]+1;
          }
        }
      }

      for(int k=0; k<26; k++){
        System.out.println((char)(k+'a') + ":" + answer_num[k]);
      }
    }
}