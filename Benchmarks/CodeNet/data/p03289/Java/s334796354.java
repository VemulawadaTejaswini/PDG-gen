import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      // 取得
	  String s = sc.next();
      if(con1(s) && con2(s) && con3(s)){
        System.out.println("AC");
      }else{
        System.out.println("WA");
      }
    }
    //一つ目の条件
    static boolean con1(String s){
      if(s.charAt(0)=='A'){
        return true;
      }else{
        return false;
      }
    }
    //二つ目の条件
    static boolean con2(String s){
      int count =0;
      String str = s.substring(2,s.length()-1);
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='C'){
          count++;
        }
      }
      if(count==1){
        return true;
      }else{
        return false;
      }
    }
    //三つ目の条件
    static boolean con3(String s){
      int count=0;
      for(int i=0;i<s.length();i++){
        if(Character.isUpperCase(s.charAt(i))){
          count++;
        }
      }
      if(count==2){
        return true;
      }else{
        return false;
      }
    }
}