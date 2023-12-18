import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] array = new String[s.length()];
    int[] numbers = new int[s.length()];


    for(int i=0;i<s.length();i++){
      array = s.split("");
    }
    for(int i=0;i<s.length();i++){
      numbers[i] =Integer.parseInt(array[i]);
    }
    //for(int a: numbers){
      //System.out.println(a);
    //}
    int sub_min = Integer.MAX_VALUE;
    for(int i=0; i<s.length()-2;i++){
      int k = numbers[i]*100+numbers[i+1]*10+numbers[i+2];
      if(Math.abs(k-753)<sub_min){
        sub_min = Math.abs(k-753);
      }
    }

    System.out.println(sub_min);

  }

}