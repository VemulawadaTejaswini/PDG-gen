import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String[] s = str.split("");
    String number = "";

    int count = 0;
    for(int i = 0; i < s.length; i++){
      for(int j = i+4; j < s.length; j++){
        number = "";
        for(int k = i; k <= j; k++){
          number += s[k];
        }
        double num = Double.parseDouble(number);
        if(num % 2019.0 == 0.0){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
