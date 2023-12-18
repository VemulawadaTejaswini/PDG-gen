import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int point = 0;
    int C_idx = 0;

    if(s.charAt(0) == 'A'){
      point++;
    }else{
      printAnswer(false);
    }

    if(s.indexOf('C') == s.lastIndexOf('C')){
      if(2 <= s.indexOf('C') && s.indexOf('C') <= s.length()-3 ){
        point++;
        C_idx = s.indexOf('C');
      }else{
        printAnswer(false);
      }
    }else{
      printAnswer(false);
    }

    String substr1 = s.substring(1, C_idx-1);
    String substr2 = s.substring(C_idx+1, s.length()-1);
    for(int i = 0; i < substr1.length(); i++){
      if(!(97 <= substr1.charAt(i)) || !(substr1.charAt(i) <= 122)){
        printAnswer(false);
      }
    }

    for(int i = 0; i < substr2.length(); i++){
      if(!(97 <= substr2.charAt(i)) || !(substr2.charAt(i) <= 122)){
        printAnswer(false);
      }
    }

    point++;

    if(point == 3){printAnswer(true);}
  }

  public static void printAnswer(boolean ans){
    if(ans){
      System.out.println("AC");
    }
    else{
      System.out.println("WA");
      System.exit(0);
    }
  }

}
