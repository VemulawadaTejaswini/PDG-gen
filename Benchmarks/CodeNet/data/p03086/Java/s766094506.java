import java.util.Scanner;
import java.util.ArrayList;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] array ;
    array = sc.next().split("");
    int a = calc(array);
    System.out.println(a);
  }


  static int calc(String[] s){
    int count =0;
    int max = 0;
    for(int i=0; i<s.length;i++){
      if(s[i].equals("A") || s[i].equals("C")){
        count += 1;
      }else if(s[i].equals("T") || s[i].equals("G")){
        count += 1;
      }else{
        if(count>max){
          max = count;
        }
        count = 0;
      }
      if(count>max){
        max = count;
      }
    }
    return max;
  }


}