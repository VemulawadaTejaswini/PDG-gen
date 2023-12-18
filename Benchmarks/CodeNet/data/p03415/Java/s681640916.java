import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String s ;
      char[] data = new char[3];
      int j = 0;

      for(int i = 0;i<3;i++){
        s = sc.nextLine();
        data[i] = s.charAt(j);
        j++;
      }

      System.out.println(data);
  }
}
