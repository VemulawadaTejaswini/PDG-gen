import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] strs = {"dream","dreamer","erase","eraser"};
    String s = sc.next();
    while(true){
      boolean endWithStr = false;
      for(String str:strs){
        if(s.endsWith(str)){
          endWithStr = true;
          s = s.substring(0,s.length()-str.length());
          break;
        }
      }
      if(!endWithStr){
        System.out.println("No");
        break;
      }
      if(s.length() <= 0){
        System.out.println("Yes");
        break;
      }
    }
  }
}