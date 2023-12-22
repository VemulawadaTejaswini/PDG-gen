import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    Stack<String> stack = new Stack<String>();

    for(int i = 0; i < line.length; i++){
      if(isNumber(line[i])){
          stack.push(line[i]);
      }else{
        int b = Integer.parseInt(stack.pop());
        int a = Integer.parseInt(stack.pop());  
        if(line[i].equals("+")){
          stack.push(String.valueOf(a+b));
        }else if(line[i].equals("-")){
            stack.push(String.valueOf(a-b));
        }else if(line[i].equals("*")){
            stack.push(String.valueOf(a*b));
        }else if(line[i].equals("/")){
            stack.push(String.valueOf(a/b));
        }
      }
    }

    System.out.println(stack.pop());
  }

  public static boolean isNumber(String term) {
      Pattern patternNum = Pattern.compile("-*[0-9]+");
      Matcher matcherNum = patternNum.matcher(term);

      return matcherNum.matches();
  }
}