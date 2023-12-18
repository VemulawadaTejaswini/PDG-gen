import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    String[] splited = S.split("(A|C|G|T)");
    int[] number = new int[splited.length];
    for(int i = 0; i<splited.length; i++) {
      number[i] = splited[i].length();
    }
    Arrays.sort(number);

    if(splited.length>0&&number[splited.length]>1){
      System.out.println(number[splited.length]-1);
    }
  }
}
