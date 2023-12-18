import java.util.*;

import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      char[] s = sc.next().toCharArray();
      
      StringBuilder res = new StringBuilder();
      for(int i = 0;i<s.length;i++){
        if(i+1==k){
          res.append(Character.toLowerCase(s[i]));
        }
        else{
          res.append(s[i]);
        }
      }
      
      System.out.println(res.toString());
      	
    }
}