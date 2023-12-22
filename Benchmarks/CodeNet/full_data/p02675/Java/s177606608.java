import java.util.*;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String hun = n.substring(0);
    String ten = n.substring(1);
    String one = n.substring(2);
    int num = 0;
    String result = "";
    if(one == null){
      if(ten == null){
        num = Interger.paserInt(hun);
        if(num == 3){
          result = "bon";
        }else if(num == 0 && num == 1 && num == 6 && num == 8){
          result = "pon";
        }else{
          result = "hon";
        }
      }else{
        num = Interger.parseInt(ten);
        if(num == 3){
          result = "bon";
        }else if(num == 0 && num == 1 && num == 6 && num == 8){
          result = "pon";
        }else{
          result = "hon";
        }
      }else{
        num = Interger.parseInt(one);
        if(num == 3){
          result = "bon";
        }else if(num == 0 && num == 1 && num == 6 && num == 8){
          result = "pon";
        }else{
          result = "hon";
        }
    }
      System.out.println(result);
    }
    
  }