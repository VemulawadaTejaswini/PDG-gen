import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    String s=scan.next();
    String p=scan.next();

    if(s.contains(p)){
      System.out.println("Yes");
    }else if(isSubString(s,p)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  static boolean isSubString(String str1,String str2){

    for(int i=1;i<str2.length();i++){
      if(str1.endsWith(str2.substring(0,i))){
        if(str1.startsWith(str2.substring(i,str2.length()))){
          return true;
        }
      }
    }

    return false;
  }
}

