import java.io.*;
import java.util.*;
class Security{
  public static void main(String[] args){
    String security_code;
    Scanner s = new Scanner(System.in);
    security_code = s.nextLine();
    bool is_bad = false;
    for(int i=0;i<security_code.length()-1;i++){
      if(security_code[i] == security_code[i+1]){
        is_bad = true;
        break;
    }
    if(is_bad){
      System.out.println("Bad");
    }else{
      System.out.println("Good");
    }
  }
}