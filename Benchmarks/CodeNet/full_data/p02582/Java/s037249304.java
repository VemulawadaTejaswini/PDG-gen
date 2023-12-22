import java.util.*;
import java.io.*;
class Main{
 static Scanner sc = new Scanner(System.in); 
public static void main(String[] argh){
  String[] str = sc.nextLine().split("");
  int count = 1;
  String temp = "";
  for(String s : str){
    if(s.equals("R") && temp.equals("R")){
      count++;
      temp = s;
    }
    else
      temp = s;
    
}
  System.out.println(count);
}
}
