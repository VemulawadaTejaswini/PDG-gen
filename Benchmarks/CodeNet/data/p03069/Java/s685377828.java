//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
// Also, sorry that the "Paste" feature no longer works! GitHub broke
// this (so we'll switch to a new provider): https://blog.github.com\
// /2018-02-18-deprecation-notice-removing-anonymous-gist-creation/
//*******************************************************************

import java.lang.*; // headers MUST be above the first class
import java.util.*;

// one class needs to have a main() method
public class Main
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt() - 1;
    char[] array = scan.next().toCharArray();
    System.out.println(stones(0, size, false, array));
  }
  
  public static int stones(int now, int size, boolean flag, char[] array){
    if(now==size){
      if(array[now]=='.' && flag)
        return 1;
      else
        return 0;
    }
    
    if(flag){
      if(array[now]=='.')
        return stones(now+1, size, true, array) + 1;
      else
        return stones(now+1, size, true, array);
    }else{
      if(array[now]=='.')
        return stones(now+1, size, false, array);
      else
        return Math.min(stones(now+1, size, true, array), stones(now+1, size, false, array)+1);
    }
  }
}
