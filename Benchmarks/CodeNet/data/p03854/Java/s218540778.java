import java.util.*;

class Main {
  static String[] strs = {
    
    "dream",
    "dreamer",
    "erase",
    "eraser"
  };
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //文字列
      String s = sc.next();
      
      while(true){
        boolean endWithStr = false;
        for(String str : strs ){
          if(s.endsWith(str)){
            endWithStr = true;
            s = s.substring(0,s.length() - str.length());
            break;
          }
        }
        if(!endWithStr){
          System.out.print("NO");
          break;
        }
        if(s.length() <= 0){
          System.out.print("YES");
          break;
        }
        
      }
    }
}